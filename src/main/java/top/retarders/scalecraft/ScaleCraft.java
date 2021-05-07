package top.retarders.scalecraft;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import net.md_5.bungee.api.plugin.Plugin;

public final class ScaleCraft extends Plugin {

    @Override
    public void onEnable() {
        DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder()
                .withDockerHost("unix:///var/run/docker.sock")
                .build();

        DockerClient dockerClient = DockerClientBuilder.getInstance(config).build();
    }

}
