package com.ms.springbootsendemail.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ms.springbootsendemail.enums.StatusEmail;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_email")
public class EmailModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;//id
    private String ownerRef;//referencia do proprietario que esta mandando a mensagem. Passo o id do usuario para quem vai ser enviado(apenas controle)
    private String emailFrom;// quem manda
    private String emailTo;//para quem que o email vai ser enviado
    private String subject;//titulo do email
    @Column(columnDefinition = "TEXT")
    private String text;//corpo do email
    private LocalDateTime sendDateEmail;//data de envio de email
    private StatusEmail statusEmail;//status do email 
}