package com.qtc.simpleDemo;

import org.eclipse.milo.opcua.sdk.server.OpcUaServer;
import org.eclipse.milo.opcua.sdk.server.api.config.OpcUaServerConfig;
import org.eclipse.milo.opcua.sdk.server.api.config.OpcUaServerConfigBuilder;
import org.eclipse.milo.opcua.stack.server.EndpointConfiguration;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

/**
 * @author:quantianchao
 * @description:xxx
 * @date:2022/6/17
 **/
public class Demo {
    public static void main(String[] args) {
        OpcUaServerConfigBuilder opcUaServerConfigBuilder= new OpcUaServerConfigBuilder();

        opcUaServerConfigBuilder.setApplicationUri("qtc:opcUa:demo");

        Set<EndpointConfiguration> endpointConfigurations =

        opcUaServerConfigBuilder.setEndpoints();

        OpcUaServerConfig opcUaServerConfig = opcUaServerConfigBuilder.build();
        OpcUaServer opcUaServer = new OpcUaServer(opcUaServerConfig);

        String url=opcUaServer.getConfig().getApplicationUri();
        System.out.println("start up"+url);
    }
}
