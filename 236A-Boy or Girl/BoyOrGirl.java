import java.util.*;
public class BoyOrGirl {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashSet<Character> hs = new HashSet<>();
        String s = sc.next();
        
        for(int i = 0; i < s.length(); i++)
        {
            if(!hs.contains(s.charAt(i)))
            {
                hs.add(s.charAt(i));
            }
        }
        if(hs.size() % 2 == 0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }
    }
    
}   
