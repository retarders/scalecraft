package top.retarders.scalecraft.vm.events;

import top.retarders.scalecraft.vm.VM;
import top.retarders.scalecraft.vm.event.VMProviderEvent;

public class VMCreatedEvent implements VMProviderEvent {

    public VM vm;

    public VMCreatedEvent(VM vm) {
        this.vm = vm;
    }

}
