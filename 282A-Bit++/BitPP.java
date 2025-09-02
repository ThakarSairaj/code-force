import java.util.*;

public class BitPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfOperations = sc.nextInt();
        ArrayList<String> operations = new ArrayList<>();
        int x = 0;
        
        for(int i = 0; i < numOfOperations; i++)
        {
            String s = sc.next();
            operations.add(s);
        }

        for(int i = 0; i < operations.size(); i++)
        {
            if(operations.get(i).equals("X++") || operations.get(i).equals("++X"))
            {
                x+=1;
            }
            else
            {
                x-=1;
            }
        }
        System.out.println(x);
    }
}
