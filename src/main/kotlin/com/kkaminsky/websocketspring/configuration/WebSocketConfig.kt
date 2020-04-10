package com.kkaminsky.websocketspring.configuration

import com.kkaminsky.websocketspring.dto.Message
import com.kkaminsky.websocketspring.dto.OutputMessage
import org.springframework.context.annotation.Configuration
import org.springframework.messaging.converter.MarshallingMessageConverter
import org.springframework.messaging.converter.MessageConverter
import org.springframework.messaging.simp.config.MessageBrokerRegistry
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker
import org.springframework.web.socket.config.annotation.StompEndpointRegistry


@Configuration
@EnableWebSocketMessageBroker
class WebSocketConfig : AbstractWebSocketMessageBrokerConfigurer() {
    override fun configureMessageBroker(config: MessageBrokerRegistry) {
        config.enableSimpleBroker("/topic")
        config.setApplicationDestinationPrefixes("/app")
    }

    override fun registerStompEndpoints(registry: StompEndpointRegistry) {
        registry.addEndpoint("/chat")
        registry.addEndpoint("/chat").withSockJS()
    }

    override fun configureMessageConverters(arg0: MutableList<MessageConverter?>): Boolean {

        val j2m = Jaxb2Marshaller()
        j2m.setClassesToBeBound(OutputMessage::class.java)
        val mar = MarshallingMessageConverter(j2m)
        arg0.add(mar)
        return true
    }
}

