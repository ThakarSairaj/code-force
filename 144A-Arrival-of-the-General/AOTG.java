import java.util.*;
public class AOTG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        
        int max = 0;
        int min = Integer.MAX_VALUE;
        int maxCntr = 0;
        int minCntr = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] > max)
            {
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        for(int i = 0; i < n; i++)
        {
            if(arr[i] == max)
            {
                maxCntr = i;
                break;
            }
        }

        for(int i = n - 1; i > 0; i--)
        {
            if(arr[i] == min){
                minCntr = i;
                break;
            }
        }

        int total = (n - 1) - minCntr;

        if(maxCntr > minCntr)
        {
            total -= 1;
        }

        System.out.println(total + maxCntr);

    }    
}
