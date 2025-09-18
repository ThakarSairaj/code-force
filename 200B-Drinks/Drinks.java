import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        double total = 0;

        for(int i = 0; i < n; i++)
        {
            total+=sc.nextDouble();
        }
        System.out.println(String.format("%.12f" ,(total / n)));
    }    
}
