import java.util.HashSet;
import java.util.Scanner;

public class IWBTG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int p = sc.nextInt();
        
        int curr;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < p; i++)
        {
            curr = sc.nextInt();
            if(!set.contains(curr))
            {
                set.add(curr);
            }
        }
        
        int q = sc.nextInt();

        for(int i = 0; i < q; i++)
        {
            curr = sc.nextInt();
            if(!set.contains(curr))
            {
                set.add(curr);
            }
        }

     
        
        for(int i = 1; i <= n; i++)
        {
            if(!set.contains(i))
            {
                System.out.print("Oh, my keyboard!");
                return;
            }
        }
        System.out.print("I become the guy.");

    }
}
