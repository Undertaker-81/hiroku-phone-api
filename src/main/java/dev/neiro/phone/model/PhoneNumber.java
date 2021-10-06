package dev.neiro.phone.model;



import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Panfilov Dmitriy
 * 01.10.2021
 */
@Entity
@Table(name = "phone_numbers")
@Data
@NoArgsConstructor
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String fio;

    private String snils;

    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;
}
