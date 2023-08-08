package br.senai.sp.form;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Form {
    public static void main(String[] args) {

        /** Definindo as Variaveis */
        String nome;
        int idade;
        int telefone;
        String nivelAcademico;
        String disciplina;

        /** Instancia Teclado Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Coleta dados do usuario  */
        System.out.println("Seja Bem Vindo(a) a Nossa Escola !");
        System.out.println("------------------------------------------");
        System.out.print("Por favor me informe seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe sua idade: ");
        idade = teclado.nextInt();
        System.out.print("Informe seu Telefone: ");
        telefone = teclado.nextInt();
        System.out.print("Informe seu Nivel Academico: ");
        nivelAcademico = teclado.next();
        System.out.print("Informe sua Disciplina: ");
        disciplina = teclado.next();
        System.out.println("------------------------------------------");


        /** Printa Informações */

        System.out.println("--------------------------------------------");
        System.out.println("Olá Prof° " + nome + ", é um desprazer tê-lo aqui !");
        System.out.println("Você informou que tem " + idade + " anos,");
        System.out.println("Seu telefone é " + telefone);
        System.out.println("Seu nivel academico é: " + nivelAcademico);
        System.out.println("E sua disciplina é: " + disciplina);
        System.out.println("--------------------------------------------");


    }
}
