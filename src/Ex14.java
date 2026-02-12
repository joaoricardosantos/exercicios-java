import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        while(true){
            System.out.print("Digite um número (Digite 0 para finalizar e somar): ");
            int num = sc.nextInt();
            if (num == 0){
                break;
            }else {
                soma += num;
            }

        }
        System.out.println("A soma dos valores números totais foi: " +soma);
        sc.close();
    }
}


