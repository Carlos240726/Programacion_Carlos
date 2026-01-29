package Tema4.Personas_Y_Cuentas;

public class Persona {
    private String[] cuentas= new String[3];
    private float[] saldos = new float[3];
    private String dni;

    public String[] getCuentas() {return cuentas;}

    public void setCuentas(String[] cuentas) {
        for (int i=0;i<=cuentas.length;i++){
            this.cuentas[i]=cuentas[i];
        }
    }

    public float[] getSaldos() {return saldos;}

    public void setSaldos(float[] saldos) {
        for (int i=0;i<=saldos.length;i++){
            saldos[i]=this.saldos[i];
        }
    }

    public String getDni() {return dni;}

    public void setDni(String dni){
        if (dni.length()!=8 && !checkDNI(dni)){

            System.out.println("El dni no es correcto, se cambiara por uno que cumpla las condiciones");
            this.dni="62438519K";
        }else {
            this.dni=dni;
        }
    }

    public static boolean checkDNI (String dni) {
        dni.toUpperCase();

        char[] numerosDni=dni.substring(0,8).toCharArray();
        char[] letraDni=dni.substring(8).toCharArray();
        char[] letras;
        letras = new char[] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto=0;
        int numeros=0;

        for (int i=0;i>=numerosDni.length;i++){
            numeros=numeros*10+numerosDni[i];
        }
        //mirar como pasar el String con los números del dni, a entero
        resto=numeros%23;
        if (letraDni[0]==letras[resto]){
            System.out.println("El dni es correcto");
            return true;
        }else {
            System.out.println("El dni no es correcto");
            return false;
        }
    }

    public void moroso(float[] saldo){
        for (int i=0;i<=saldo.length;i++){
            if (saldo[i]<0){
                System.out.println("Alerta, esta persona es morosa");
            }
        }
    }
    public Persona (){
        this.cuentas= new String[]{"AV5243159875662154121515", "PL2431673421543245767456", "GH1346724659672457575576"};
        this.saldos = new float[]{613.54f, -1545.11f, 44.00f};
        this.dni="62438519K";
    }
    public Persona (String[] cuentas,String dni, float[] saldos){
        this.cuentas=cuentas;
        this.dni=dni;
        this.saldos=saldos;
    }
}