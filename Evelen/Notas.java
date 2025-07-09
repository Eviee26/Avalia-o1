package Evelen;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner sci= new Scanner(System.in);
        System.out.println("Digite sua 1° nota:");
        float nota1 = sci.nextFloat();
        System.out.println("Digite sua 2° nota:");
        float nota2 = sci.nextFloat();
        System.out.println("Digite sua 3° nota:");
        float nota3 = sci.nextFloat();
        System.out.println("Digite sua 4° nota:");
        float nota4 = sci.nextFloat();
        System.out.println("Digite sua 5° nota:");
        float nota5 = sci.nextFloat();
        System.out.println("Digite sua 6° nota:");
        float nota6 = sci.nextFloat();
        System.out.println("Digite sua 7° nota:");
        float nota7 = sci.nextFloat();
        System.out.println("Digite sua 8° nota:");
        float nota8 = sci.nextFloat();

        float b1 = (nota1 + nota2) / 2;
        float b2 = (nota3 + nota4) / 2;
        float s1 = (b1 + b2) / 2;

        float b3 = (nota5 + nota6) / 2;
        float b4 = (nota7 + nota8) / 2;
        float s2 = (b3 + b4) / 2;

        float mf = (s1 + s2) / 2;

        System.out.println("1° bimedtre"+b1);
        System.out.println("2° bimestre"+b2);
        System.out.println("1° semestre"+s1);
        System.out.println("3° bimestre"+b3);
        System.out.println("4° bimestre"+b4);
        System.out.println("2° semestre"+s2);
        System.out.println("Media final"+mf);
    }
}
