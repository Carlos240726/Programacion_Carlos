package Tema4.Personas_Y_Cuentas;

public class Cuenta {
    private String numeroCuenta;
    private float saldo;

    /*Datos*/
    public Cuenta (){
        numeroCuenta="ES5015939273261574203697";
        saldo= 294.82F;
    }
    public Cuenta (String cuenta,float ahorros){
        this.numeroCuenta=cuenta;
        this.saldo=ahorros;
    }

    /*Gets*/
    public float getSaldo() {
        return saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /*Sets*/
    public boolean setNumeroCuenta(String cuenta) {
        char[] cuentaArray=cuenta.toCharArray();
        char[] verificacionNumerica={'0','1','2','3','4','5','6','7','8','9'};
        char[] verificacionLetras={'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        if (cuentaArray.length==24){
            for (int i=2;i<=24;i++){
                for (int j=0;j>=verificacionNumerica.length;j++){
                    if (verificacionNumerica[j]!=cuentaArray[i]){return false;}
                }
            }
            for (int i=0;i>1;i++){
                for (int j=0;j>=verificacionLetras.length;j++){
                    if (cuentaArray[i]!=verificacionLetras[j]){return false;}
                }
            }
            return true;
        }else {
            System.out.println("La cuenta indicada no cumple los requisitos, se le creara una cuenta que cumpla los requsitos");
            this.numeroCuenta="ES5015939273261574203697";
            return false;
        }
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /*Consultar saldos*/
    public void consultarSaldo() {
        System.out.println("Tu saldo es de " + saldo);
    }

    /*Recibir Abonos*/
    public void recibirAbonos (float abono){
        System.out.println("El abono a recibir es " + abono);
        System.out.println("El valor en su cuenta antes de que se le deposite el abono es de " + saldo);
        saldo=saldo+abono;
        System.out.println("Su saldo despues de que se le deposite el abono es de " + saldo);
    }

    /*Pagar Recibos*/
    public void pagarRecibos (float recibo){
        System.out.println("El recibo a pagar es " + recibo);
        System.out.println("El valor en su cuenta antes de que se le quite lo necesario para abonar el recibo es de " + saldo);
        saldo=saldo-recibo;
        System.out.println("Su saldo despues de que se abone el recibo es de" + saldo);
    }
}
