package Semana3Moshak;

import java.util.Scanner;

public class S3MoshakC {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        double angle = calcularangulos(a , b ,c );
        System.out.println(angle);

    }
    public static double calcularangulos(int a , int b , int c){
        return Math.acos((Math.pow(a , 2)+Math.pow(b, 2)+Math.pow(c , 2))/2*a*b);




    }
}
