import java.util.Scanner;

public class att {

    public static void main(String[] args) {
        int opcao, meses;
        double salario, decimo;
        Scanner scan = new Scanner(System.in);

        System.out.println("------ Bem vindo ao APP do sálarios  ------");
        System.out.println("\n\n");
        System.out.println("------ Informe seu sálario: ");
        salario = scan.nextDouble();
        System.out.println("\n\n----------- 1 => Novo salário -------------");
        System.out.println("-------------- 2 => Férias ----------------");
        System.out.println("--------- 3 => Décimo terceiro ------------");
        System.out.println("-------------- 4 => Sair ------------------");
        System.out.println("\nDigite a opção desejada: ");
        opcao = scan.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n\n");

        if (opcao == 1) {
            if (salario <= 350) {
                salario += salario * 0.15;
                System.out.println("Salario reajustado R$" + salario);
            } else if (salario >= 350.1 && salario <= 600) {
                salario += salario * 0.10;
                System.out.println("Salario reajustado R$" + salario);
            } else {
                salario += salario * 0.05;
                System.out.println("Salario reajustado R$" + salario);
            }
        } else if (opcao == 2) {
            salario += salario / 3;
            System.out.println("Salario reajustado para as férias R$" + salario);
        } else if (opcao == 3) {
            System.out.println("Quantos meses você trabalhou: ");
            meses = scan.nextInt();
            if (meses > 12) {
                System.out.println("No maximo 12 meses, meses automaticamente reajustados para 12");
                meses = 12;
                decimo = (salario * meses) / 12;
                salario += (salario * meses) / 12;
                System.out.println("O seu decimo é " + decimo);
                System.out.println("O salario total é " + salario);
            } else {
                decimo = (salario * meses) / 12;
                salario += (salario * meses) / 12;
                System.out.println("O seu decimo é " + decimo);
                System.out.println("O salario total é " + salario);
            }
        } else if (opcao == 4) {
            System.out.println("Programa finalizado");
        }
    }
}
