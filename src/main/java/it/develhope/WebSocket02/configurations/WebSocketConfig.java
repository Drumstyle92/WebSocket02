package it.develhope.WebSocket02.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author Drumstyle92
 * Class for configuring the web socket,
 * which is an HTTP-based bidirectional protocol for real-time web applications
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /**
     * @param config Parameter for logging in and out
     * Method for handling incoming and outgoing messages
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // outgoing messages will use topic
        config.enableSimpleBroker("/topic");
        // incoming messages will go to app
        config.setApplicationDestinationPrefixes("/app");
    }

    /**
     * @param registry Parameter where the reference endpoint is inserted
     * Method to register endpoints for use of type STOMP. STOMP is a real-time
     * messaging protocol that defines the message format and operations supported by a STOMP server
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat").withSockJS();
    }

}

