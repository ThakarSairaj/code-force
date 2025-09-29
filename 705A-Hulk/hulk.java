import java.util.*;

public class hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0)
            {
                 
                sb.append("I hate that ");
            }
            else
            {
                sb.append("I love it ");
            }
        }
        System.out.println(sb.deleteCharAt(sb.length()-1));
    }
}
