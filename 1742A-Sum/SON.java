import java.util.*;

class sum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, c = 0;


        for(int i = 0; i < n; i++)
        {   
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            
            if((a+b) == c)
            {
                System.out.println("YES");
            }
            else if((a+c) == b)
            {
                System.out.println("YES");
            }
            else if((b+c) == a)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}