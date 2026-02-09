import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Me informe a sua idade: ");
        int idade = sc.nextInt();

        if (idade < 18){
            System.out.println("Você ainda é menor de idade!");
        }else {
            System.out.println("Você já é maior de idade!");
        }
        sc.close();
    }
}
