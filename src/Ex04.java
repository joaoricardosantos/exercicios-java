import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número real: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double n2 = sc.nextDouble();

        double media = (n1+n2) / 2;

        System.out.println("A média dos dois números digitados foi de: " +media);
        sc.close();
    }
}
