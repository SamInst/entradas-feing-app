package com.example.appmotel.model;

import com.example.appmotel.response.StatusEntrada;
import com.example.appmotel.response.StatusPagamento;
import com.example.appmotel.response.TipoPagamento;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "tb_entradas")
public class Entradas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Quartos quartos;
    private LocalTime horaEntrada;
    private LocalTime horaSaida;
    private String placa;

    @OneToMany
    private List<EntradaConsumo> entradaConsumo;

    private StatusEntrada statusEntrada;

    private LocalDate dataRegistroEntrada;

    public Entradas() {
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
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

    public Entradas(Long id, Quartos quartos, LocalTime horaEntrada, LocalTime horaSaida, String placa) {
        this.id = id;
        this.quartos = quartos;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.placa = placa;
    }

    public Entradas(Long id, Quartos quartos, LocalTime horaEntrada, LocalTime horaSaida, String placa, TipoPagamento tipoPagamento, StatusPagamento status_pagamento, StatusEntrada statusEntrada) {
        this.id = id;
        this.quartos = quartos;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.placa = placa;
        this.tipoPagamento = tipoPagamento;
        this.status_pagamento = status_pagamento;
        this.statusEntrada = statusEntrada;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public LocalDate getDataRegistroEntrada() {
        return dataRegistroEntrada;
    }

    public void setDataRegistroEntrada(LocalDate dataRegistroEntrada) {
        this.dataRegistroEntrada = dataRegistroEntrada;
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
    public Quartos getQuartos() {return quartos;}
    public void setQuartos(Quartos quartos) {
        this.quartos = quartos;
    }
    public StatusEntrada getStatusEntrada() {
        return statusEntrada;
    }
    public void setStatusEntrada(StatusEntrada statusEntrada) {
        this.statusEntrada = statusEntrada;
    }
}
