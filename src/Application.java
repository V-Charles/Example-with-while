
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe números inteiros para soma: ");
        System.out.println("OBS.: Digite 0 (ZERO) para encerrar!");
        int x = sc.nextInt();
        
        int soma = 0;
        while(x != 0){
            soma += x;
            x = sc.nextInt();
        }
        System.out.println("Total: " + soma);
        
        sc.close();
    }
}
