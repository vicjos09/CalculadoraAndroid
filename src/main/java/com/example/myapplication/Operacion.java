package com.example.myapplication;

public class Operacion {
    int primerValor;
    int segundoValor;
    int flag;

    protected Operacion(int primerValorNuevo, int segundoValorNuevo){
        primerValor=primerValorNuevo;
        segundoValor=segundoValorNuevo;
    }
    protected Operacion(){

    }

    public int getPrimerValor() {
        return primerValor;
    }

    public int getSegundoValor() {
        return segundoValor;
    }

    public int getFlag() {
        return flag;
    }

    public void setPrimerValor(int primerValor) {
        this.primerValor = primerValor;
    }

    public void setSegundoValor(int segundoValor) {
        this.segundoValor = segundoValor;
    }

    void setFlag(int number){
        flag=number;
    }
    protected int suma(){
        return primerValor+segundoValor;
    }
    protected int resta(){
        return primerValor-segundoValor;
    }
    protected int multiplicacion(){
        return primerValor*segundoValor;
    }
    protected int division(){
        return primerValor/segundoValor;
    }

}
