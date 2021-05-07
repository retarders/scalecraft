package top.retarders.scalecraft.vm;

import top.retarders.scalecraft.vm.event.VMProviderEvent;

import java.util.function.Consumer;

/**
 * A VMProvider is an interface to software that provides
 * virtual machine / container capabilities, software like Docker and Podman (for god's sake don't use podman)
 */
public interface VMProvider {

    void listen(Class<? extends VMProviderEvent> event, Consumer<VMProviderEvent> callback);

}
