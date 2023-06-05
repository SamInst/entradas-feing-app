package com.example.appmotel.response;

import java.time.LocalTime;
import java.util.List;

public record EntradaResponse(
        Integer apartamento,
        LocalTime hora_entrada,
        LocalTime hora_saida,
        String placa,
        TempoPermanecido tempo_permanecido,
        List<com.example.appmotel.model.EntradaConsumo> consumo,

        double total_consumo,
        double valor_entrada,
        double total
) {
    public record TempoPermanecido(
            int horas,
            int minutos
    ){}

//    public record EntradaConsumo(
//            String Item,
//            Float valor
//    ){}
}
