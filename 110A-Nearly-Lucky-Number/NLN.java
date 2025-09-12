import java.util.*;

public class NLN {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long last;
    int cntr = 0;
    int luckyCntr = 0;

    if(n < 0)
    {
        System.out.println("NO");
        return;
    }

    while(n != 0)
    {
        last = n % 10;
        n /= 10;
        
       if(last == 4)
       {
        luckyCntr++;
       }
       else if(last == 7)
       {
        luckyCntr++;
       }
    }

    if((luckyCntr == 4) || (luckyCntr == 7))
    {
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
}    
}
