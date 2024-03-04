import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao jogo \"Par\" ou \"Impar\" \n");
        System.out.println("Instruções: Você escolherá ser Par ou Ímpar e em seguida escolherá um número de 0 a 10.\n" +
                "O computador também escolherá um número de 0 a 10. Se a soma dos dois números for par e você escolheu Par, você ganha! E vice-versa.");
        System.out.println("Faça a sua escolhar: \"Par\" ou \"Impar\" ");
        System.out.print("Digite a sua escolhar aqui:");
        Scanner scan = new Scanner(System.in);
        String escolha = scan.next();
        escolha += scan.nextLine();
        System.out.print("Digite seu número (0 a 10):");
        int jogada = scan.nextInt();

        Random random = new Random();
        int jogadaComputador = random.nextInt(0, 10);

        int calculaJogada = jogadaComputador + jogada;

        String resultado = calculaJogada % 2 == 0 ? "par" : "impar";

        System.out.println("\n");
        System.out.println("Número do jogador: "+jogada);
        System.out.println("Número do computador: "+ jogadaComputador);
        System.out.println("Soma: "+ calculaJogada);
        System.out.println(resultado.toUpperCase()+" venceu!");
        System.out.println("\n");

        if(resultado.equalsIgnoreCase(escolha)){
            System.out.println("Você ganhou!");
        }else{
            System.out.println("Você perdeu.");
        }


    }
}


