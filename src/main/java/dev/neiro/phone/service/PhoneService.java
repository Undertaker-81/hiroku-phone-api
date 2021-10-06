package dev.neiro.phone.service;

import dev.neiro.phone.dto.PhoneNumberDto;
import dev.neiro.phone.model.PhoneNumber;
import dev.neiro.phone.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Panfilov Dmitriy
 * 01.10.2021
 */
@Service
public class PhoneService {
    @Autowired
    private PhoneRepository repository;

    public PhoneNumberDto getInfo(String number){
        PhoneNumber phoneNumber = repository.getPhoneNumbersByPhoneNumber(number);
        PhoneNumberDto phoneNumberDto = new PhoneNumberDto();
        if (phoneNumber != null) {
            phoneNumberDto.setId(phoneNumber.getId());
            phoneNumberDto.setFio(phoneNumber.getFio());
            phoneNumberDto.setPhoneNumber(phoneNumber.getPhoneNumber());
            phoneNumberDto.setAddress(phoneNumber.getAddress());
            phoneNumberDto.setSnils(phoneNumber.getSnils());
        } else {
            phoneNumberDto.setFio("");
            phoneNumberDto.setPhoneNumber(number);
            phoneNumberDto.setAddress("");
            phoneNumberDto.setSnils("");
        }
        return phoneNumberDto;
    }

    @Transactional
    public void save(PhoneNumberDto phoneNumberDto) {
        if (phoneNumberDto != null) {

            if (phoneNumberDto.getId() == null) {
                PhoneNumber phoneNumber = new PhoneNumber();
                phoneNumber.setPhoneNumber(phoneNumberDto.getPhoneNumber());
                phoneNumber.setAddress(phoneNumberDto.getAddress());
                phoneNumber.setFio(phoneNumberDto.getFio());
                phoneNumber.setSnils(phoneNumberDto.getSnils());
                repository.save(phoneNumber);
            }
            else {
                PhoneNumber phoneNumber = repository.getById(phoneNumberDto.getId());
                phoneNumber.setPhoneNumber(phoneNumberDto.getPhoneNumber());
                phoneNumber.setAddress(phoneNumberDto.getAddress());
                phoneNumber.setFio(phoneNumberDto.getFio());
                phoneNumber.setSnils(phoneNumberDto.getSnils());
                repository.save(phoneNumber);
            }
        }
    }
}
