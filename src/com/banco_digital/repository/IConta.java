package com.banco_digital.repository;

public interface IConta {
    public void sacar(double var1);

    public void depositar(double var1);

    public void transferir(double var1, IConta var3);

    public void imprimirExtrato();
}
