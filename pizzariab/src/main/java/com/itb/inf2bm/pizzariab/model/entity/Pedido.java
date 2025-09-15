package com.itb.inf2bm.pizzariab.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    @Column(nullable = false, columnDefinition = "DECIMAL(5,2)")
    private double valorPedido;
    @Column(nullable = false)
    private LocalDateTime dataHoraPeidido;
    @Column(nullable = true)
    private LocalDateTime dataHoraEntrega;
    @Column(length = 20, nullable = false)
    private String status;
    private boolean codStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public LocalDateTime getDataHoraPeidido() {
        return dataHoraPeidido;
    }

    public void setDataHoraPeidido(LocalDateTime dataHoraPeidido) {
        this.dataHoraPeidido = dataHoraPeidido;
    }

    public LocalDateTime getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public void setDataHoraEntrega(LocalDateTime dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}
