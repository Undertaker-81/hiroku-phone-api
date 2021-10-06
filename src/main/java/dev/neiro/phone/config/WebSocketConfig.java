package dev.neiro.phone.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author Panfilov Dmitriy
 * 02.10.2021
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {

        registry.enableSimpleBroker( "/chat");
        registry.setApplicationDestinationPrefixes("/app");
       // registry.setUserDestinationPrefix("/user");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
      //  registry.addEndpoint("/ws");
        registry.addEndpoint("/ws")
                                        .setAllowedOrigins("https://phone-ui-app.herokuapp.com/")
                                        //.setAllowedOriginPatterns("*")
                                        .withSockJS();
    }
}
