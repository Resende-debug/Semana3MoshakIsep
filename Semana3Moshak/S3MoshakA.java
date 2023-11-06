package Semana3Moshak;

import java.util.Scanner;

public class S3MoshakA {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int K = 5;

        int N = ler.nextInt();
        int num = ler.nextInt();
        int soma = 0;
        int count = 0;
        int countTenativas = 0;


        while (contaralgarismos(num) < N) {
            soma += num;
            count++;

            num = ler.nextInt();
            countTenativas++;


        }
        double media = 0;

        if (count > 0) {
            media = (double) soma / count;

            System.out.printf("%.2f %n", media);
        } else {
            media = 0;
            System.out.printf("%.2f %n", media);
        }


    }

    public static int contaralgarismos(int num) {
        int dig = 0;
        int count = 0;
        while (num > 0) {
            dig = num % 10;
            count++;
            num /= 10;

        }
        return count;


    }
}
