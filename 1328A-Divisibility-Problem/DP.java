// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class DP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, rem;
        
        for(int i = 0; i < n; i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a%b == 0)
            {
                System.out.println(0);
            }
            else
            {
            rem = Math.abs((a % b) - b);
            System.out.println(rem);
            }
                   
        }
    }
}