package Semana3Moshak;

import java.util.Scanner;


public class S4MoshakE {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        final int K = ler.nextInt();
        for (int i = 0; i <K ; i++) {

            int num1 = ler.nextInt();
            int num2= ler.nextInt();
            boolean verificar = contardigitos(num1 , num2);
            if(verificar){
                System.out.println(num1+"/"+num2);
            }else{
                System.out.println("No results");
            }
        }
    }
    public static boolean contardigitos(int num1 , int num2){
        boolean verificar = false;
        while(num1>0 && num2 >0){
            int dig = num1%10;
            int dig1 = num2 % 10;
            if(dig == dig1){

                verificar = true;
            }
            num1 /=10;
            num2 /=10;
        }
        return verificar;
    }
}
