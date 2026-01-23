package Tema4.Persona;

public class Persona {

    private String dni;
    String nombre;
    String apellidos;
    int edad;
    int adultAge=18;
    int retiredAge=65;

    public void getDni(String dni){
        if (dni.length()!=8){
            System.out.println("El dni no es correcto, se cambiara por uno que cumpla las condiciones");
            this.dni="62438519K";
        }else {
            this.dni=dni;
        }
    }

    public void getNombre(String nombre) {
        String comprobar = ",;.:-_¨´{ç}]+*[]¡¿'?0=9)8(7/6&¬5%4$~3·#21!|<>€";
        char[] comprobarchar=comprobar.toCharArray();
        char[] nombrechar=nombre.toCharArray();
        boolean verificacion=true;

        for (int i=0;i<nombrechar.length;i++){
            for(int j=0;j<comprobarchar.length;j++){
                if (nombrechar[i]==comprobarchar[j]){
                    verificacion=false;
                }
            }
        }
        if (verificacion){
            this.nombre=nombre;
        }else {
            this.nombre="Manolo";
        }
    }

    public void getApellidos (String apellidos) {
        String comprobar = ",;.:-_¨´{ç}]+*[]¡¿'?0=9)8(7/6&¬5%4$~3·#21!|<>€";
        char[] comprobarchar=comprobar.toCharArray();
        char[] apellidoschar=apellidos.toCharArray();
        boolean verificacion=true;

        for (int i=0;i<apellidoschar.length;i++){
            for(int j=0;j<comprobarchar.length;j++){
                if (apellidoschar[i]==comprobarchar[j]){
                    verificacion=false;
                }
            }
        }
        if (verificacion){
            this.apellidos=apellidos;
        }else {
            this.apellidos="Rogriguez Garcia";
        }
    }

    public void getEdad (int edad) {
        if (edad>122 || edad<0){
            this.edad=62;
        }else {
            this.edad=edad;
        }
    }

    public void Persona () {
        this.dni="62438519K";
        this.nombre="Manolo";
        this.apellidos="Rogriguez Garcia";
        this.edad=62;
    }
    public void Persona (String dni, String nombre, String apellidos, int edad) {
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    public String toString(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Dni: " + dni);
        return "";
    }
    public void isAdult (int edad) {
        if (edad>=adultAge){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("No es mayor de edad");
        }
    }
    public void isRetired (int edad) {
        if (edad>=retiredAge){
            System.out.println("Esta retirado");
        }else{
            System.out.println("No esta retirado");
        }
    }
    public void ageDifference (int edadP1, int edadP2 ) {
        int diferencia = 0;
        if (edadP1>edadP2){
            diferencia=edadP1-edadP2;
            System.out.println("La diferencia de edad es de " + diferencia);
        }else {
            diferencia=edadP2-edadP1;
            System.out.println("La diferencia de edad es de " + diferencia);
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
        resto=numeros%23;
        if (letraDni[0]==letras[resto]){
            System.out.println("El dni es correcto");
            return true;
        }else {
            System.out.println("El dni no es correcto");
            return false;
        }
    }
}
