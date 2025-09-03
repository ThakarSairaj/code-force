import java.util.*;


public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int index = sc.nextInt();
        
        if(total >= index)
        {

            int[] arr = new int[total];
            int counter = 0;
            

            for(int i = 0; i < total; i++)
            {
                
                arr[i] = sc.nextInt();
            }
            
            if(arr[0] == 0)
            {
                System.out.println(0);
                return;
            }

            for(int i = 0; i < total; i++)
            {
                if(arr[i] >= arr[index - 1] && arr[i] > 0)
                {
                    counter++;
                }
            }
        
        System.out.println(counter);
        return;
    }
    System.out.println(0);
    }
}
