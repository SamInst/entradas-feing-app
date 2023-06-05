package com.example.appmotel.model;

import com.example.appmotel.response.StatusPagamento;
import com.example.appmotel.response.TipoPagamento;
import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.List;

@Entity
public class Entradas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Integer apt;
    private LocalTime horaEntrada;
    private LocalTime horaSaida;
    private String placa;
    @OneToMany
    private List<EntradaConsumo> entradaConsumo;

    public Entradas() {
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public Integer getApt() {
        return apt;
    }

    public void setApt(Integer apt) {
        this.apt = apt;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }
    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    private TipoPagamento tipoPagamento;
    private StatusPagamento status_pagamento;

    public Entradas(Long id, Integer apt, LocalTime horaEntrada, LocalTime horaSaida, String placa) {
        this.id = id;
        this.apt = apt;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;

        this.placa = placa;
    }

    public Entradas(Long id, Integer apt, LocalTime horaEntrada, LocalTime horaSaida, String placa, TipoPagamento tipoPagamento, StatusPagamento status_pagamento) {
        this.id = id;
        this.apt = apt;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.placa = placa;
        this.tipoPagamento = tipoPagamento;
        this.status_pagamento = status_pagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public StatusPagamento getStatus_pagamento() {
        return status_pagamento;
    }

    public void setStatus_pagamento(StatusPagamento status_pagamento) {
        this.status_pagamento = status_pagamento;
    }

    public List<EntradaConsumo> getEntradaConsumo() {
        return entradaConsumo;
    }

    public void setEntradaConsumo(List<EntradaConsumo> entradaConsumo) {
        this.entradaConsumo = entradaConsumo;
    }
}
