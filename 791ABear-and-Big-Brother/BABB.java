import java.util.Scanner;

public class BABB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cntr = 0;

        while(a <= b)
        {
            a *= 3;
            b *= 2;
            cntr++;
        }
        System.out.println(cntr);
    }
}
