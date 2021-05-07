package top.retarders.scalecraft;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.InspectContainerResponse;
import com.github.dockerjava.api.model.Event;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.command.EventsResultCallback;
import net.md_5.bungee.api.plugin.Plugin;

public final class ScaleCraft extends Plugin {

    @Override
    public void onEnable() {
        // DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder()
        //         .withDockerHost("unix:///var/run/docker.sock")
        //         .build();

        // DockerClient dockerClient = DockerClientBuilder.getInstance(config).build();

        // dockerClient.eventsCmd().exec(new EventsResultCallback() {
        //     @Override
        //     public void onNext(Event event) {
        //         if(event.getType() == null || event.getType().getValue() != "container") {
        //             super.onNext(event);
        //             return;
        //         }

        //         InspectContainerResponse response = dockerClient.inspectContainerCmd(event.getId()).exec();

        //     }
        // });
    }

}
