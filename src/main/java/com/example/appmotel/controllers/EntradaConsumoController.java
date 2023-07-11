package com.example.appmotel.controllers;

import com.example.appmotel.model.EntradaConsumo;
import com.example.appmotel.services.EntradaConsumoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/entrada-consumo")
public class EntradaConsumoController {
    private final EntradaConsumoService entradaConsumoService;

    public EntradaConsumoController(EntradaConsumoService entradaConsumoService) {
        this.entradaConsumoService = entradaConsumoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EntradaConsumo> buscarTodos(){
        return entradaConsumoService.BuscaTodos();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public EntradaConsumo criaConsumo(EntradaConsumo entradaConsumo){
        return entradaConsumoService.addConsumo(entradaConsumo);
    }
    @DeleteMapping("/{id_consumo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletaConsumoPorEntradaId( @PathVariable ("id_consumo") Long id_consumo){
         entradaConsumoService.deletaConsumoPorEntradaId(id_consumo);
    }

    @GetMapping("/findByEntrada")
    @ResponseStatus(HttpStatus.OK)
    public List<EntradaConsumo> findEntradaConsumoByEntrada(Long entrada_id){
        return entradaConsumoService.findEntradaConsumoByEntrada(entrada_id);
    }
}
