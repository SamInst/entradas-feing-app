package com.example.appmotel.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class RegistroConsumoEntrada {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

//    private Integer quantidade;
//
//    @ManyToOne
//    private Itens itens;

//    @ManyToOne
//    private RegistroDeEntradas registroDeEntradas;

    @OneToMany
    List<EntradaConsumo> entradaConsumoList;

//    private Float total;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

//    public Integer getQuantidade() {
//        return quantidade;
//    }
//
//    public void setQuantidade(Integer quantidade) {
//        this.quantidade = quantidade;
//    }
//
//    public Itens getItens() {
//        return itens;
//    }
//
//    public void setItens(Itens itens) {
//        this.itens = itens;
//    }

//    public RegistroDeEntradas getRegistroDeEntradas() {
//        return registroDeEntradas;
//    }
//
//    public void setRegistroDeEntradas(RegistroDeEntradas registroDeEntradas) {
//        this.registroDeEntradas = registroDeEntradas;
//    }

//    public Float getTotal() {
//        return total;
//    }
//
//    public void setTotal(Float total) {
//        this.total = total;
//    }

    public List<EntradaConsumo> getEntradaConsumoList() {
        return entradaConsumoList;
    }

    public void setEntradaConsumoList(List<EntradaConsumo> entradaConsumoList) {
        this.entradaConsumoList = entradaConsumoList;
    }
}
