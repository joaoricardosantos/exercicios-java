import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 6){
            System.out.println("Aluno Aprovado");
        }else {
            System.out.println("Aluno Reprovado");
        }
        sc.close();
    }
}
