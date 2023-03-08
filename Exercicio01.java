import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String corUm, corDois;
        String juncao;

        System.out.println("Digite o valor da primeira cor: ");
        corUm = sc.next();

        System.out.println("Digite o valor da cor dois: ");
        corDois = sc.next();

        // O equals é utilizado para fazer comparações em Strings, o == é para comparação entre valores

        if (corUm.equals("Preto")) {
            corUm = "0";
        }
        if (corUm.equals("Marrom")) {
            corUm = "1";
        }
        if (corUm.equals("Vermelho")) {
            corUm = "2";
        }
        if (corUm.equals("Laranja")) {
            corUm = "3";
        }
        if (corUm.equals("Amarelo")) {
            corUm = "4";
        }
        if (corUm.equals("Verde")) {
            corUm = "5";
        }
        if (corUm.equals("Azul")) {
            corUm = "6";
        }
        if (corUm.equals("Violeta")) {
            corUm = "7";
        }
        if (corUm.equals("Cinza")) {
            corUm = "8";
        }
        if (corUm.equals("Branco")) {
            corUm = "9";
        }
        if (corDois.equals("Preto")) {
            corDois = "0";
        }
        if (corDois.equals("Marrom")) {
            corDois = "1";
        }
        if (corDois.equals("Vermelho")) {
            corUm = "2";
        }
        if (corDois.equals("Laranja")) {
            corDois = "3";
        }
        if (corDois.equals("Amarelo")) {
            corDois = "4";
        }
        if (corDois.equals("Verde")) {
            corDois = "5";
        }
        if (corDois.equals("Azul")) {
            corDois = "6";
        }
        if (corDois.equals("Violeta")) {
            corDois = "7";
        }
        if (corDois.equals("Cinza")) {
            corUm = "8";
        }
        if (corDois.equals("Branco")) {
            corDois = "9";
        }
        juncao = corUm + corDois;
        System.out.println(juncao);
        sc.close();
    }
}