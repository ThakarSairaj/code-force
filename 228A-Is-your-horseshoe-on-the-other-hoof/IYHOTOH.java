import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IYHOTOH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
       
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < 4; i++)
        {
            a = sc.nextInt();
            if(!set.contains(a))
            {
                set.add(a);
            }
        }

        System.out.println(4 - set.size());
       
    }    
}
