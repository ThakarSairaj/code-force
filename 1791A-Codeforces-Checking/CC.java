import java.util.*;
public class CC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++)
        {
            sb.append(sc.next().charAt(0));

            if("codeforces".contains(sb))
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            sb.setLength(0);
        }
    }    
}
