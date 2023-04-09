import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao;
        DecimalFormat fmt = new DecimalFormat("0.00");

        System.out.println("-------------------------");
        System.out.println("--- Digite uma opção para visualizar a resolução de um Exercicio ---");
        System.out.println("1 - Execicio 1");
        System.out.println("2 - Exercicio 2");
        System.out.println("3 - Exercicio 3");
        System.out.println("4 - Exercicio 4");
        System.out.println("5 - Exercicio 5");
        System.out.println("0 - Encerrar");
        System.out.println("-------------------------");
        opcao = teclado.nextInt();
        System.out.println("--------------------------");

        // Exercicio 1
        while (opcao != 0) {
            switch (opcao) {

                case 1:
                    int K = 0;
                    int INDICE = 13;
                    int SOMA = 0;

                    while (K < INDICE) {
                        K += 1;
                        SOMA = SOMA + K;
                    }
                    System.out.println("Resultado do Exercicio 1: " + SOMA);
                    break;

                // Exercicio 2
                case 2:
                    System.out.println("Digite um número.");
                    int x = teclado.nextInt();

                    int a = 0;
                    int b = 1;
                    int c = 1;

                    while (c < x) {
                        c = a + b;
                        a = b;
                        b = c;
                    }
                    if (c == x) {
                        System.out.println("------------------");
                        System.out.println("Resposta: " + x + " Pertence a sequência de Fibonacci");

                    } else {
                        System.out.println("------------------");
                        System.out.println("Resposta: " + x + " Não pertence a sequência de Fibonacci.");
                    }

                    break;

                // Exercicio 3
                case 3:
                    // Alternativa a
                    int a1 = 9;
                    System.out.println("a) 1, 3, 5, 7, " + a1);
                    System.out.println(
                            "É uma sequencia logica de números impares, começando por 1 onde somando 2 ´--> x+2");

                    System.out.println("------------------");
                    // Alternativa b
                    int b1 = 64 * 2;
                    System.out.println("b) 2, 4, 8, 16, 32, 64," + b1);
                    System.out
                            .println("A logica é que começando por 2 vai se multiplicando o termo atual por 2 -> x*2 ");

                    System.out.println("------------------");
                    // alternativa c
                    double c1 = Math.pow(7, 2);
                    System.out.println("c) 0, 1, 4, 9, 16, 25, 36," + c1);
                    System.out.println("cada número da sequência é o quadrado do número natural correspondente x²");

                    System.out.println("------------------");
                    // alternativa d
                    double d1 = Math.pow(10, 2);
                    System.out.println("d) 4, 16, 36, 64," + d1);
                    System.out.println(
                            " cada número da sequência é o quadrado do número natural multiplicado por 2 -> x²");

                    System.out.println("------------------");
                    // alternativa e
                    int e1 = 8 + 5;
                    System.out.println("e) 1, 1, 2, 3, 5, 8," + e1);
                    System.out.println("Essa é uma sequência de Fibonacci");

                    System.out.println("------------------");
                    // alternativa d
                    int f1 = 20;
                    System.out.println("f) 0, 1, 4, 9, 16, 25, 36, " + f1);
                    // Não foi possivel entender a logica certa da F,
                    // mas conseguir entender que começou a ter uma ordem consecutiva a partir do 16

                    break;

                // Exercicio 4
                case 4:
                    double distanciaTotal = 100;
                    double distanciaCarro = 50;
                    double velocidadeCarro = 110;
                    double tempoCarro = distanciaCarro / velocidadeCarro;
                    double tempoMin = tempoCarro * 60;
                    System.out.println("Resposta do Exercicio 4: ");
                    System.out.println("------------------");
                    System.out.println("Tempo para o Carro chegar a metade da distancia do destino: "
                            + fmt.format(tempoMin) + " min" + " ' Ribeirão Preto <-> Franca '");

                    double distanciaCaminhao = 50;
                    double velocidadeCaminhao = 80;
                    double tempoAtraso = 2 * 5;
                    double tempoCaminhao = distanciaCaminhao / velocidadeCaminhao;
                    double tempoMin2 = (tempoCaminhao * 60) + (tempoAtraso);
                    System.out.println("------------------");
                    System.out.println("Tempo para o Caminhao chegar a metade da distancia do destino: "
                            + fmt.format(tempoMin2) + " min" + " ' Franca <-> Ribeirao Preto '");

                    System.out.println("------------------");
                    System.out.println("O caminhão demora " + fmt.format(tempoMin2) +
                            " min Para chegar até o meio da distância entre as duas cidades " +
                            "e o carro demora um tempo de "
                            + fmt.format(tempoMin) + " min");
                    System.out.println("para chegar na metade da distancia" +
                            " já o caminhão estará sempre se distanciando da cidade de Franca em direção "
                            + "a Ribeirão preto e o carro sempre estará se distanciando " +
                            "de Ribeirão preto em direção a Franca" + " Quando os dois se encontrarem " +
                            "já que o carro está em maior valocidade, " +
                            "ele estará mais proximo de Franca que é seu destino, " +
                            "e o caminhao estará proximo de Ribeirão preto");
                    System.out.println("------------------");
                    break;

                // Exercicio 5
                case 5:
                    System.out.println("Essa vaga pode ser minha");
                    String palavra = "Essa vaga pode ser minha";
                    int len = palavra.length();
                    char[] tempCharArray = new char[len];
                    char[] charArray = new char[len];

                    // String Original numa matriz de caracteres
                    for (int i = 0; i < len; i++) {
                        tempCharArray[i] = palavra.charAt(i);
                    }

                    // Matriz reversa de caracteres
                    for (int j = 0; j < len; j++) {
                        charArray[j] = tempCharArray[len - 1 - j];
                    }

                    String reversePalavra = new String(charArray);
                    System.out.println(reversePalavra);

                    break;

                default:
                    System.out.println("Opção Invalida");

            }
            System.out.println("-------------------------");
            System.out.println("--- Digite uma opção para visualizar a resolução de um Exercicio ---");
            System.out.println("1 - Execicio 1");
            System.out.println("2 - Exercicio 2");
            System.out.println("3 - Exercicio 3");
            System.out.println("4 - Exercicio 4");
            System.out.println("5 - Exercicio 5");
            System.out.println("0 - Encerrar");
            System.out.println("-------------------------");
            opcao = teclado.nextInt();
            System.out.println("--------------------------");

        }

    }
}