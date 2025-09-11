import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int upper = 0;
        int lower = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >=97 && s.charAt(i) <=122)
            {
               lower++;
            }
            else{
                upper++;
            }
        }
        String res;
        if(upper > lower)
        {
            res = s.toUpperCase();
        }
        else{
            res = s.toLowerCase();
        }
        System.out.println(res);
    }
}
