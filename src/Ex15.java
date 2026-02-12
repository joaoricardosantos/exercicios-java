import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int num = sc.nextInt();
        int fatorial = 1;
        for (int i = num; i >= 1; i--) {
            fatorial *= i;
        }
        System.out.println("O valor fatorial do número é: " +fatorial);
        sc.close();
    }
}
