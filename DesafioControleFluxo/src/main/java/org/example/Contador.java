package org.example;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Por favor digite o primeiro parâmentro:");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Por favor digite o segundo parâmentro:");
        int segundoParametro = terminal.nextInt();
        terminal.close();

        try{
            contar(primeiroParametro,segundoParametro);
        }catch (ParametrosInvalidosException exception){
            System.out.println("Erro:"+exception);
        }

    }
    static void contar(int variavelUm, int variavelDois) throws ParametrosInvalidosException {
        if (variavelUm > variavelDois){
            throw new ParametrosInvalidosException("ParametroUm é maior que o ParametroDois! " +
                    " Por favor tente colocar outros números e deixe o segundo parâmetro com valor maior que o primeiro");
        }else{
            int contador = variavelDois - variavelUm;
            for(int cont = 0;cont <= contador;cont++)
            {
                System.out.println("Imprimindo o número "+cont);
            }
        }
    }
}