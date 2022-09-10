package com.ms.springbootsendemail.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data //classe que vem do metodo post(DTO de entrada)
public class EmailDTO {

    @NotBlank
    private String ownerRef;//referencia do proprietario que esta mandando a mensagem. Passo o id do usuario para quem vai ser enviado(apenas controle)
    
    @NotBlank
    @Email
    private String emailFrom;// quem manda
    
    @NotBlank
    @Email
    private String emailTo;//para quem que o email vai ser enviado
    
    @NotBlank
    private String subject;//titulo do email
    
    @NotBlank
    private String text;//corpo do email
}