import java.util.*;
public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String transalted = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--)
        {
            sb.append(input.charAt(i));
        }

        if(sb.toString().equals(transalted))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
