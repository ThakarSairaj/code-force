import java.util.*;

public class BeautifulMatix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int res = 0;
        int ith = 0;
        int jth = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                int num = sc.nextInt();
                if(num == 1)
                {
                    ith = i + 1;
                    jth = j + 1;
                }

            }
        }

        System.out.println((Math.abs(ith - 3) + Math.abs(jth - 3)));

        
    }
}
