package com.itb.inf2bm.pizzariab.model.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pedido {

    private long id;
    private double valorPedido;
    private LocalDateTime dataHoraPeidido;
    private LocalDateTime dataHoraEntrega;
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
