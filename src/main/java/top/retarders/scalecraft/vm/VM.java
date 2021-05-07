package top.retarders.scalecraft.vm;

import java.util.Map;

/**
 * A VM is a virtual machine provided by a {@link VMProvider} that runs a minecraft server
 */
public class VM {

    public final String name;
    public final Map<String, Object> environment;
    public final Map<Integer, Integer> ports;

    public String message;
    public int players;
    public int maxPlayers;

    /**
     * @param name the name of the VM
     * @param environment the environment variables
     * @param ports the forwarded ports
     */
    public VM(String name, Map<String, Object> environment, Map<Integer, Integer> ports) {
        this.name = name;
        this.environment = environment;
        this.ports = ports;
    }

    /**
     * Fetches the minecraft server running on the VM
     * NOTE: The VM should be in the same network as the proxy
     */
    public void fetch() { }

}
