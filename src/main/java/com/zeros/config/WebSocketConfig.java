package com.zeros.config;

import com.zeros.handlers.PingHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by Abdellah on 18/12/2015.
 */
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(marcoHandler(), "/websocket/ping");
    }
    @Bean
    public PingHandler marcoHandler() {
        return new PingHandler();
    }
}
