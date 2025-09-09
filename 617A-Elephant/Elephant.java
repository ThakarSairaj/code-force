import java.util.Scanner;

public class Elephant {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    
    int cntr = 0;
    int cal = n;
    while(n != 0)
    {
        n -= 5;
        if(n < 0)
        {
           n = cal;
           n-=4;
           
           if(n < 0)
           {

            n = cal;
            n -= 3;

            if(n < 0)
            {
                n = cal;
                n -= 2;

                if(n < 0)
                {
                    n = cal;
                    n -= 1;
                }
            }
           } 
        }
        cal = n;
        cntr++;
        
    }

    System.out.println(cntr);

}    
}
