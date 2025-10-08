import java.util.*;
public class AAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++)
        {
            if(!set.contains(s.charAt(i)) && (s.charAt(i) != '{' && s.charAt(i)!= '}') && (s.charAt(i) != ',') &&(s.charAt(i) != ' '))
            {
                set.add(s.charAt(i));
            }
        }

        int res = set.size();
        
        if(res == -1)
        {
            System.out.println(0);
        }
        else{

            System.out.println(res);
        }



    }
}
