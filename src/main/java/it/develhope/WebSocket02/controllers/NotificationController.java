package it.develhope.WebSocket02.controllers;

import it.develhope.WebSocket02.entities.ClientMessageDTO;
import it.develhope.WebSocket02.entities.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Drumstyle92
 * Controller class used to define a REST API that exposes the endpoint for sending the message via WebSocket
 */
@RestController
public class NotificationController {

    /**
     * Automatic instance of this class to take advantage of methods to
     * simplify sending messages to the desired destination
     */
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    /**
     * @param message Parameter where the structure of the message resides
     * Post method which is a REST endpoint that allows you to send a message via an HTTP POST request
     */
    @PostMapping("/broadcast-message")
    public void broadcastMessage(@RequestBody MessageDTO message) {

        messagingTemplate.convertAndSend("/topic/broadcast", message);

    }

    /**
     * @param clientMessage Parameter where the customer message structure resides
     * @return the message dto
     * broadcastMessage() method which is annotated with @MessageMapping
     * and @SendTo to tell Spring that it should handle incoming
     * messages on this endpoint and that it should send received
     * messages to all clients that subscribed to the broadcast topic
     */
    @MessageMapping("/client-message")
    @SendTo("/topic/broadcast")
    public MessageDTO handleClientMessage(ClientMessageDTO clientMessage) {

       return new MessageDTO(clientMessage.getClientName(),
               clientMessage.getClientAlert(), clientMessage.getClientMsg());

    }

}

