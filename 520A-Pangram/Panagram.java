import java.util.*;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String ss = s.toLowerCase();
        HashSet<Character> set = new HashSet<>();

        
        for(int i = 0; i < n; i++)
        {
            if(!set.contains(ss.charAt(i)))
            {
                set.add(ss.charAt(i));
            }
        }
        
        if(set.size() == 26)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }    
}
