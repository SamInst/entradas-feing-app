package com.example.appmotel.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_pernoites")
public class Pernoites {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Quartos apartamento;
    @ManyToOne
    private Client client;
//    @OneToMany
//    private List<PernoiteConsumo> pernoiteConsumo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Integer quantidadePessoa;
//    private TipoPagamento tipoPagamento;
//    private StatusPagamento status_pagamento;
    private Float total;

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {this.id = id;}
    public Integer getQuantidadePessoa() {return quantidadePessoa;}
    public void setQuantidadePessoa(Integer quantidadePessoa) {this.quantidadePessoa = quantidadePessoa;}
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public LocalDate getDataSaida() {
        return dataSaida;
    }
    public Client getClient() {
        return client;
    }
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }
    public void setClient(Client client) {
        this.client = client;
    }
//    public TipoPagamento getTipoPagamento() {
//        return tipoPagamento;
//    }
//    public StatusPagamento getStatus_pagamento() {
//        return status_pagamento;
//    }
//
//    public List<PernoiteConsumo> getPernoiteConsumo() {
//        return pernoiteConsumo;
//    }
//
//    public void setPernoiteConsumo(List<PernoiteConsumo> pernoiteConsumo) {
//        this.pernoiteConsumo = pernoiteConsumo;
//    }

    public Quartos getApartamento() {
        return apartamento;
    }

    public void setApartamento(Quartos apartamento) {
        this.apartamento = apartamento;
    }
//
//    public void setTipoPagamento(TipoPagamento tipoPagamento) {
//        this.tipoPagamento = tipoPagamento;
//    }
//
//    public void setStatus_pagamento(StatusPagamento status_pagamento) {
//        this.status_pagamento = status_pagamento;
//    }
}