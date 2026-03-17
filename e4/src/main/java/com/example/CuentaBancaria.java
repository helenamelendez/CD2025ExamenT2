package com.example;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
