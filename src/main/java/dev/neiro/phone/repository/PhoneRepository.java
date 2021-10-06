package dev.neiro.phone.repository;


import dev.neiro.phone.model.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Panfilov Dmitriy
 * 01.10.2021
 */
@Repository
public interface PhoneRepository extends JpaRepository<PhoneNumber, Long> {

    PhoneNumber getPhoneNumbersByPhoneNumber(String number);
}
