import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("O número é positivo!");
        } else if (numero < 0) {
            System.out.println("O número é negativo!");
        }else {
            System.out.println("O número digitado é o número 0!");
        }
        sc.close();
    }
}
