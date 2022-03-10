package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long>{

}
