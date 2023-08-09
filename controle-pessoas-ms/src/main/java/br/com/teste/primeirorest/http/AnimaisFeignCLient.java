package br.com.teste.primeirorest.http;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.teste.primeirorest.compartilhado.AnimalDTO;

@FeignClient(name = "controle-animais-ms")
public interface AnimaisFeignCLient {
    
    @GetMapping(path = "/api/animais/{dono}/lista")
    List<AnimalDTO> obterAnimais(@PathVariable Integer dono);
    
}
