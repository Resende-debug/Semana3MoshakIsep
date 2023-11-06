package Semana3Moshak;

import java.util.Scanner;

public class S3MoshakB {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int alunos = ler.nextInt();
        int disciplinas = ler.nextInt();
        for (int i = 0; i <disciplinas ; i++) {
            String disciplina = ler.next();
            int aprovados = ler.nextInt();
            int reprovados = alunos - aprovados;
            System.out.println("Subject: " + disciplina);
            System.out.println("- Approved: " + carateres('*' ,aprovados));
            System.out.println("- Failed: "+ carateres('*' ,reprovados));

        }

    }
    public static String carateres(char simbolo , int vezes){
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i <vezes ; i++) {
            resultado.append(simbolo);
        }
        return resultado.toString();
    }


}
