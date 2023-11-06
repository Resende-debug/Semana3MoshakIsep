package Semana3Moshak;

import java.util.Scanner;

public class S3MoshakD {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int m = ler.nextInt();
        int n = ler.nextInt();
        if(m>=n) {
            System.out.println("C" + "(" + m + "," + n + ")" + combinacoes(m, n));
            System.out.println("P" + "(" + m + "," + n + ")" + permutacoes(m, n));
        }

    }
    public static int fatorial(int numero){
        int resultado  =1 ;
        for (int i = 1; i <= numero ; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }
    public static int combinacoes(int m , int n){
        return fatorial(m) / fatorial(n)*fatorial(m-n);
    }
    public static int permutacoes(int m , int n){
        return fatorial(m)/fatorial(m-n);
    }

}
