package dev.jorge;

public class Persona {
    private double peso;
    private double estatura;

    public Persona(double peso, double estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }

    public double calcularIMC() {
        return peso / Math.pow(estatura, 2);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
}
