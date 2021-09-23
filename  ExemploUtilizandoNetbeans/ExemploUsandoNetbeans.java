package ExemploSeminario;

import java.util.Scanner;
import java.util.Random;

public class ExemploUsandoNetbeans {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int opcao;
        int escolha_computador;
        int escolha_usuario;

        System.out.println("Olá! Qual o seu nome?");
        String nome = scan.nextLine();
        System.out.println("Prazer em conhece-lo " + nome + "!");
        System.out.println(nome + ", você quer jogar comigo?");
        System.out.println("\nInforme o número da sua opção. \n1 -> Sim\n2 -> Não");
        opcao = scan.nextInt();

        if (opcao == 2) {
            System.out.println("Que pena! mas tudo bem, fica para a próxima");
        } else if (opcao == 1) {
            System.out.println("Ok! o jogo é assim...");
            System.out.println("Eu vou escolher um número de 0 a 10...");
            System.out.println("Mas não vou falar para você qual foi.");
            System.out.println("você terá cinco chances para adivinhar, se conseguir...");
            System.out.println("Você será o vencedor!!");

            escolha_computador = gerador.nextInt(11);

            int palpite = 5;

            System.out.println("Ok, " + nome + ". Eu já escolhi!");
            System.out.println("Agora tente adivinhar!");
            do {
                escolha_usuario = scan.nextInt();
                if (escolha_usuario != escolha_computador) {
                    palpite--;
                    System.out.println("Resposta errada!");
                    System.out.println("Restam "+palpite+" palpites");
                    if(palpite == 0) {
                        System.out.println("Os palpites acabaram, você não acertou!");
                        System.out.println("O número era "+escolha_computador);
                        break;
                    }
                } else {
                    System.out.println("Parabéns! você acertou!");
                }
            } while(escolha_computador != escolha_usuario);
        }
    }
}
