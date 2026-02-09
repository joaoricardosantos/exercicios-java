import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println("O primeiro número é maior que o segundo!");
        } else if (n2 > n1) {
            System.out.println("O Segundo número é maior que o primeiro!");
        }else {
            System.out.println("Os números são iguais!");
        }
        sc.close();
    }
}
