import java.util.*;

public class IC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int[] arr = new int[d];
        
        int cntr = 0;
        for(int i = k - 1; i < d; i += k)
        {
            if(arr[i] != 1)
            {
                arr[i] = 1;
                cntr++;
            }
        }
        
        for(int i = l - 1; i < d; i += l)
        {
            if(arr[i] != 1)
            {
                arr[i] = 1;
                cntr++;
            }
        }
        
        for(int i = m - 1; i < d; i += m)
        {
          if(arr[i] != 1)
            {
                arr[i] = 1;
                cntr++;
            }
        }
        
        for(int i = n - 1; i < d; i += n)
        {
         if(arr[i] != 1)
            {
                arr[i] = 1;
                cntr++;
            }
        }
        
        System.out.println(cntr);
        
        
        
        
    }    
}
