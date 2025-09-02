import java.util.*;

public class LongWords
{
    static String LongW(String input)
    {
        int len = input.length() - 2 ;
        String l = Integer.toString(len);

        return input.charAt(0) + "" + l + "" + input.charAt(len + 1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] res = new String[num];
        for(int i = 0; i < num; i++)
        {
            String input = sc.next();
            
            if(input.length() > 10)
            {
                res[i] = LongW(input);
            }
            else
            {

                res[i] = input;
            }
          
        }

        for(String s1 : res)
        {
            System.out.println(s1);
        }
       
        
    }
}