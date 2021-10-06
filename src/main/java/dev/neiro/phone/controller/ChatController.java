package dev.neiro.phone.controller;

import dev.neiro.phone.dto.PhoneNumberDto;
import dev.neiro.phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

/**
 * @author Panfilov Dmitriy
 * 02.10.2021
 */
@Controller
public class ChatController {

    @Autowired
    private PhoneService service;

    @MessageMapping("/send/message")
    public void sendMessage(@Payload PhoneNumberDto message) {
        service.save(message);
    }
}
