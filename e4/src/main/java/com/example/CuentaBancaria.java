package com.example;


/**
 * Clase CuentaBancaria
 * @author Helena
 */
public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;

    /**
     * Constructor de la clase CuentaBancaria
     * @param numeroCuenta  inicializa numeroCuenta con el valor del parametro
     * establece el valor del atributo saldo a 0
     */
    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    /**
     * Funcion ingresar que suma una cantidad recibida por parametro al atributo saldo
     * @param cantidad  cantidad recibida que se sumara
     */
    public void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    /**
     * Funcion retirar
     * comprueba que saldo sea superior a la cantidad recibida por paramentro
     * si es el caso resta cantidad recibida por parametro al atributo saldo
     * @param cantidad  cantidad recibida que se restara
     * @return  devulve un booleano que informa del exito de la operacion
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }  

    /**
     * getter del atributo saldo
     * @return devuleve el valor del atributo saldo
     */

    public double getSaldo() {
        return saldo;
    }

    /**
     * getter del atributo NumeroCuenta
     * @return devuleve el valor del atributo NumeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * setter del atributo NumeroCuenta
     * @param numeroCuenta  asigna el valor recibido por parametro al atributo NumeroCuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
