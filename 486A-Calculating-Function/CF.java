import java.util.Scanner;

public class CF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long total = n % 2==0 ? (n/2) : -((1+n) / 2);

        System.out.println(total);
    }   
}
