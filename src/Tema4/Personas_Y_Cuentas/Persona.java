package Tema4.Personas_Y_Cuentas;

import java.util.Arrays;

public class Persona {
    private Cuenta[] cuentas;
    private int numCuentas;
    private String dni;
/*Constructores*/
    public Persona(){
        this.dni="12345678A";
        this.cuentas=new Cuenta[3];
        this.numCuentas=0;
    }
    public Persona(String dni, Cuenta[] cuentas, int numCuentas){
        this.dni=dni;
        this.cuentas=new Cuenta[3];
        this.numCuentas=0;

        for (int i=0;i<cuentas.length && i < 3; i++){
            this.cuentas[i]=cuentas[i];
            this.numCuentas++;
        }
    }
    public Persona(String dni){
        this.dni=dni;
    }
    /*Gets*/
    public String getDni() {
        return dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public int getNumCuentas() {
        return numCuentas;
    }
/*Sets*/
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.numCuentas=0;
        for (int i=0;i<cuentas.length && i < 3; i++){
            this.cuentas[i]=cuentas[i];
            this.numCuentas++;
        }
    }

    public void setNumCuentas(int numCuentas) {
        if (numCuentas >= 0 && numCuentas <= 3) {
            this.numCuentas = numCuentas;
        }
    }
/*Morosa*/
    public boolean esMorosa(){
        for (int i=0;i<numCuentas;i++){
            if (cuentas[i].getSaldo()<0){
                return true;
            }
        }
        return false;
    }
/*Añadir Cuenta*/
    public void añadirCuenta(Cuenta cuenta) {
        if (numCuentas < 3) {
            cuentas[numCuentas] = cuenta;
            numCuentas++;
            System.out.println("Cuenta añadida. Total de cuentas: " + numCuentas);
        } else {
            System.out.println("No puedes tener más de 3 cuentas");
        }
    }
/*Buscar persona*/
    public static Persona buscarPersona(String dni) {
        for (int i = 0; i < PruebaCuentas.numPersonas; i++) {
            if (PruebaCuentas.personas[i].getDni().equals(dni)) {
                return PruebaCuentas.personas[i];
            }
        }
        return null;
    }
/*Buscar Cuenta*/
    public Cuenta buscarCuenta(String numeroCuenta) {
        for (int i = 0; i < numCuentas; i++) {
            if (cuentas[i].getNumeroCuenta().equals(numeroCuenta)) {
                return cuentas[i];
            }
        }
        return null;
    }
/*Mostrar datos*/
    public void mostrarDatos() {
        System.out.println("\n--- DATOS DE LA PERSONA ---");
        System.out.println("DNI: " + dni);
        System.out.println("Numero de cuentas: " + numCuentas);

        for (int i = 0; i < numCuentas; i++) {
            System.out.println("Cuenta " + (i + 1) + ": " +
                    cuentas[i].getNumeroCuenta() +
                    " - Saldo: " + cuentas[i].getSaldo() + " euros");
        }

        if (esMorosa()) {
            System.out.println("ESTADO: MOROSA (tiene deudas)");
        } else {
            System.out.println("ESTADO: Al corriente de pagos");
        }
        System.out.println("---------------------------\n");
    }
}