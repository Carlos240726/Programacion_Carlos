package Tema4.Hero;

public class Hero {

    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;
    private int verificatorAttr;
    boolean heroAlive=true;

    public void getName(String name) {
        String comprobar = ",;.:-_¨´{ç}]+*[]¡¿'?0=9)8(7/6&¬5%4$~3·#21!|<>€";
        char[] comprobarchar=comprobar.toCharArray();
        char[] nombrechar=name.toCharArray();
        boolean verificacion=true;

        for (int i=0;i<nombrechar.length;i++){
            for(int j=0;j<comprobarchar.length;j++){
                if (nombrechar[i]==comprobarchar[j]){
                    verificacion=false;
                }
            }
        }
        if (verificacion){
            this.name=name;
        }else {
            this.name="Manolo";
        }
    }

    public void getLevel() {
        verificatorAttr=0;
        this.level=verificatorAttr+1;
    }

    public void getHealth(int health) {
        verificatorAttr=9;
        if (health<=verificatorAttr){
            this.health=verificatorAttr+1;
        }else{
            this.health=health;
        }
    }
    public void getMaxHealth(int maxHealth) {
        verificatorAttr=9;
        if (maxHealth<=verificatorAttr){
            this.maxHealth=verificatorAttr+1;
        }else{
            this.maxHealth=maxHealth;
        }
    }

    public void getExperience() {
        verificatorAttr=0;
        this.experience=verificatorAttr;
    }

    public void getAttack(int attack) {
        verificatorAttr=1;
        if (attack<verificatorAttr){
            this.attack=verificatorAttr;
        }else{
            this.attack=attack;
        }
    }

    public void getDefense(int defense){
        verificatorAttr=1;
        if (defense<verificatorAttr){
            this.defense=verificatorAttr;
        }else{
            this.defense=defense;
        }
    }
    public void drinkPotion() {
        int potionValue = 10;
        int salud=this.health+potionValue;
        if (salud>this.maxHealth){
            this.health=this.maxHealth;
        }else {
            this.health=salud;
        }
    }
    public void rest () {
        int restValue=50;
        int salud=this.health+restValue;
        if (salud>this.maxHealth){
            this.health=this.maxHealth;
        }else {
            this.health=salud;
        }
    }
    public String toString(){
        System.out.println("Nombre:         " + name);
        System.out.println("Nivel:          " + level);
        System.out.println("Salud:          " + health);
        System.out.println("Salud Maxima:   " + maxHealth);
        System.out.println("Experiencia:    " + experience);
        System.out.println("Ataque:         " + attack);
        System.out.println("Defensa:        " + defense);
        return "";
    }

    public int attackHero(int defense, int health){
        verificatorAttr=10;
        int damage=this.attack-defense;
        int experiencia=this.experience;
        if (damage<=0) {damage=1;}
        health=health-damage;

        this.experience=experiencia+verificatorAttr;
        verificatorAttr=verificatorAttr*5;
        if (this.experience>=verificatorAttr){
            levelUP(this.attack,this.defense,this.health);
            this.experience=0;
        }
        System.out.println("El jugador " + this.name + " ha realizado " + damage + " daño al enemigo");
        return health;
    }

    public void attackEnemy(int attack){
        int damage=attack-this.defense;
        int salud=this.health;
        if (damage<=0) {damage=1;}
        this.health=salud-damage;

        System.out.println("El jugador ha recibido " + damage + " de daño, su salud restante es de " + this.health);

        if (health<=0){heroAlive=false;}
    }
    public void levelUP (int attack, int defense, int health) {
        System.out.println("Felicidades, has subido de nivel");
        System.out.println("Ataque          +   1");
        System.out.println("Defensa         +   1");
        System.out.println("Salud           +   5");

        this.attack= attack+1;
        this.defense=defense+1;
        this.health=health+5;

        if (this.health>this.maxHealth){
            this.health=this.maxHealth;
        }
    }
}
