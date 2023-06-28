package com.example.appmotel.response;

import java.time.LocalTime;
import java.util.List;

public record EntradaResponse(
        Integer apartamento,
        LocalTime hora_entrada,
        LocalTime hora_saida,
        String placa,
        TempoPermanecido tempo_permanecido,
        List<ConsumoResponse> consumo,
        StatusEntrada statusEntrada,

        double total_consumo,
        double valor_entrada,
        double total
) {
    public record TempoPermanecido(
            int horas,
            int minutos
    ){}
}
