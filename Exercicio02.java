import java.util.Scanner;

public class Exercicio02{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o salário do funcionário: ");
    double salario = scan.nextDouble();

    System.out.println("Digite a quantidade de faltas no mês: ");
    int qtdFaltas = scan.nextInt();

    System.out.println("Digite o quantidade de produtos vendidos no mês: ");
    int qtdProdutosVnd = scan.nextInt();


    double descontoFalta = 0;
    double bonusVenda = 0;

    if(qtdFaltas >= 5) descontoFalta = salario * 0.15;
    if(qtdProdutosVnd <= 20) bonusVenda = qtdProdutosVnd * 10;
    else bonusVenda = qtdProdutosVnd * 13;

    double salarioFinal = salario - descontoFalta + bonusVenda;

    System.out.println(" O salário final do funcionário é de "+salarioFinal);
  }
}
