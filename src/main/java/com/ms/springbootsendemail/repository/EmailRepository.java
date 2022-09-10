package com.ms.springbootsendemail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.springbootsendemail.model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{
}