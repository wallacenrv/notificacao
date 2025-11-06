package com.wallacen.notificacao.controller;

import com.wallacen.notificacao.business.EmailService;
import com.wallacen.notificacao.dtos.TarefaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefaDto tarefaDto){
        emailService.enviarEmail(tarefaDto);
        return ResponseEntity.ok().build();
    }
}
