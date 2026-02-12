import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para você ver a sua tabuada: ");
        int numero = sc.nextInt();
        for (int tabuada = 1; tabuada <=10; tabuada++){
            System.out.println(numero + "x" + tabuada + " = " + tabuada * numero);
        }
        sc.close();
    }
}
