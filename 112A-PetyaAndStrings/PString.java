import java.util.*;

public class PString {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
  
        String s1 =  str1.toLowerCase();
        String s2 = str2.toLowerCase();
        
        char c1, c2;
        
         for(int i = 0; i < s1.length(); i++)
         {   
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            
            if(c1 != c2)
            {
                if(c1 > c2)
                {
                    System.out.println(1);
                    return;
                }
                else
                {
                    System.out.println(-1);
                    return;
                }
            }
            
        }
        
    System.out.println(0);
}

}
