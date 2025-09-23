import java.util.*;
public class LS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cntr = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++)
        {
            sb.append(sc.next());
            if(sb.charAt(0) != 'c')
            {
                cntr++;
            }
            if(sb.charAt(1) != 'o')
            {
                cntr++;
            }
            if(sb.charAt(2) != 'd')
            {
                cntr++;
            }
            if(sb.charAt(3) != 'e')
            {
                cntr++;
            }
            if(sb.charAt(4) != 'f')
            {
                cntr++;
            }
            if(sb.charAt(5) != 'o')
            {
                cntr++;
            }
            if(sb.charAt(6) != 'r')
            {
                cntr++;
            }
            if(sb.charAt(7) != 'c')
            {
                cntr++;
            }
            if(sb.charAt(8) != 'e')
            {
                cntr++;
            }
            if(sb.charAt(9) != 's')
            {
                cntr++;
            }
           
            sb.setLength(0);
            System.out.println(cntr); 
            cntr = 0;
        }
    }    
}
