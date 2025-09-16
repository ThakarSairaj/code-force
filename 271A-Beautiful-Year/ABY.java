
import java.util.Scanner;

public class ABY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        int a, b, c, d;

        while(flag)
        {
            year++;
            sb.append(Integer.toString(year));
            a = sb.charAt(0) - '0';
            b = sb.charAt(1) - '0';
            c = sb.charAt(2) - '0';
            d = sb.charAt(3) - '0';
            if((a!=b) && (a!=c) && 
                (a!=d) && (b!=c) &&
                (b!=d) && (c!=d))
                {
                    System.out.println(a+"" + b + "" + c + "" + d);
                    return;
                }
                sb.setLength(0);
            
        }
    }
}
