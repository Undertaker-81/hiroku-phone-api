package dev.neiro.phone.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Panfilov Dmitriy
 * 01.10.2021
 */
@Data
@NoArgsConstructor
public class PhoneNumberDto implements Serializable {
    private  Long id;

    private String fio;

    private String snils;

    private String address;

    private String phoneNumber;
}
