import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes, faltas = 0, produtos = 0;
        double salarioTotal = 0, aumentoSalario, reducaoSalario;

        System.out.println("Digite a quantidade de dias do mês");
        mes = sc.nextInt();

        if (mes == 31 || mes == 30 || mes == 28) {
            System.out.println("Digite a quantidade de faltas do funcinario (Caso ele tenha faltado, ou do contrario digite o valor 0 e prossiga): ");
            faltas = sc.nextInt();
        }
        if (faltas >= 5) {
            System.out.println("Digite o salario do funcionario para o desconto do salario: ");
            salarioTotal = sc.nextDouble();
            reducaoSalario = salarioTotal - ((15.0 / 100.0) * salarioTotal);
            System.out.println("O novo salario dele é: " + reducaoSalario);
        } else {
            System.out.println("Digite o salario do funcionario: ");
            salarioTotal = sc.nextDouble();
            System.out.println("Digite a quantidade de produtos que ele vendeu");
            produtos = sc.nextInt();
            aumentoSalario = (produtos * 10) + salarioTotal;
            System.out.println("Este é o salario do funcionario: " + aumentoSalario);
        } if (produtos >= 20){
            System.out.println("Digite o salario do funcionario: ");
            salarioTotal = sc.nextDouble();
            aumentoSalario = (produtos * 13) + salarioTotal;
            System.out.println("Esté é o novo salario do funcionario: " + aumentoSalario);
        }
        sc.close();
    }
}