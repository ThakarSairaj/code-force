import java.util.*;
public class HTL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cntr = 0;

        while(n > 0)
        {
            if(n >= 100)
            {
                n -= 100;
                cntr++;
            }
            else if(n >= 20)
            {
                n -= 20;
                cntr++;
            }
            
           else if(n >= 10)
            {
                n -= 10;
                cntr++;
            }

           else if(n >= 5)
            {
                n -= 5;
                cntr++;
            }

           else if(n >= 1)
            {
                n -= 1;
                cntr++;
            }


        }
        System.out.println(cntr);
    }    
}
