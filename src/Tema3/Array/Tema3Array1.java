package Tema3.Array;

public class Tema3Array1 {
    public static void muestraArray(int []grades){
        for (int i=0; i<=9;i++){
            System.out.println(grades[i]);
            for (int a = 1;a<7;a++){
                int num = i + 1;
                grades[a] = num;
            }
        }
    }

    public static void main (String[] args){
        int []grades;
        grades = new int []{0,2,4,6,8,10,12,14,16,18};
        muestraArray(grades);
    }
}
