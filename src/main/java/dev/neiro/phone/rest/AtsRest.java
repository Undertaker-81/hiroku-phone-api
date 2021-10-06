package dev.neiro.phone.rest;

import dev.neiro.phone.dto.PhoneNumberDto;
import dev.neiro.phone.model.PhoneNumber;
import dev.neiro.phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Panfilov Dmitriy
 * 01.10.2021
 */
@RestController
@RequestMapping(value = "/rest/api")
public class AtsRest {

    @Autowired
    private PhoneService service;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;


    @PostMapping("phone-number")
    @ResponseStatus(HttpStatus.OK)
    public void getInfo(@RequestParam String phoneNumber) {
        messagingTemplate.convertAndSend(
                "/chat",
                service.getInfo(phoneNumber));

    }
}
