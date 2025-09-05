import java.util.*;
import javax.lang.model.util.ElementScanner14;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        boolean isAdd = false;
        // ArrayList<Integer> arr = new ArrayList<>();

        // int num = 0;

        int ones = 0;
        int twos = 0;
        int threes = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '1')
            {
                ones++;

            }
            
            else if(s.charAt(i) == '2')
            {
                twos++;
            }
          
            else if(s.charAt(i) == '3')
            {
                threes++;
            }

            else
            {
                isAdd = true;
            }


        }
        //System.out.println(ones + " " + twos + " " + threes +" " +  isAdd);
        if(isAdd)
        {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < ones; i++)
            {
                sb.append("1+");

            }
            
            for(int i = 0; i < twos; i++)
            {
                sb.append("2+");

            }
            for(int i = 0; i < threes; i++)
            {
                sb.append("3+");
                

            }
            System.out.println(sb.subSequence(0, sb.length()-1));
            return;
            
        }
        else{
            if(ones > 0)
            {
                System.out.println("1");
            }
            else if(twos > 0)
            {
                System.out.println("2");
            }
            else
            {
                System.out.println("3");
            }
        }
    }
}
