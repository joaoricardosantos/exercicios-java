import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se ele é ímpar ou par: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("O número é par!");
        }else {
            System.out.println("O número é ímpar!");
        }
        sc.close();
    }
}
