import java.util.Scanner;

public class POM {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a, b, c;
    for(int i = 0; i < n; i++)
    {
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if((a + b) == c)
        {
            System.out.println('+');
        }
        else
        {
            System.out.println('-');
        }
    }
    
}    
}
