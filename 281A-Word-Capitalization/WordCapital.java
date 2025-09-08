import java.util.*;

public class WordCapital {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int first = s.charAt(0);
        String news = "";
        char newc;
        if(first >= 97 && first <= 122)
        {   
            
            newc = (char)(first - 32);
            news = s.substring(1, s.length());
             
        }
        else
        {
            System.out.println(s);
            return;
        }

        System.out.println(newc + "" +news);
    }
}
