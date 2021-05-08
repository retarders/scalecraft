package top.retarders.scalecraft.docker;

import com.google.common.collect.Maps;
import top.retarders.scalecraft.vm.VMProvider;
import top.retarders.scalecraft.vm.event.VMProviderEvent;

import java.util.Map;
import java.util.function.Consumer;

public class DockerVMProvider implements VMProvider {

    private Map<Class<? extends VMProviderEvent>, Consumer<VMProviderEvent>> listeners = Maps.newHashMap();

    @Override
    public void listen(Class<? extends VMProviderEvent> event, Consumer<VMProviderEvent> callback) {
        this.listeners.put(event, callback);
    }

    @Override
    public void callEvent(VMProviderEvent event) {
        this.listeners.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(event.getClass()))

                // perhaps execute it inside a new thread? (or a bungeecord task or whatever it's called)
                .forEach(entry -> entry.getValue().accept(event));
    }

}
