package com.example.appmotel.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_entrada_consumo")
public class EntradaConsumo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Integer quantidade;
    @ManyToOne
    @JoinColumn(name = "fkc9pcieysq53b746buc8e0w53t", nullable = false)
    private Itens itens;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "fk64r481rxs9s131p9suxf8ppxe", nullable = false)
    private Entradas entradas;
    private Float total;

    public void setId(Long id) { this.id = id; }
    public Long getId() { return id; }
    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
    public Itens getItens() { return itens;}
    public Entradas getEntradas() { return entradas; }
    public Float getTotal() { return total; }
    public EntradaConsumo(Integer quantidade, Itens itens, Entradas entradas) {
        this.quantidade = quantidade;
        this.itens = itens;
        this.entradas = entradas;
        this.total = quantidade.floatValue() * itens.getValor();
    }
    public EntradaConsumo() {}

    public void setItens(Itens itens) {
        this.itens = itens;
    }

    public void setEntradas(Entradas entradas) {
        this.entradas = entradas;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public EntradaConsumo(Itens itens) {
        this.itens = itens;
    }
}