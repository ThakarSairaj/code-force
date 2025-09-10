import java.util.*;

public class SAB {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();
    
    int ans = 0;
    for(int i = 1; i <= w; i++)
    {
        ans += i*k;

    }

    if(ans > n)
    {
        System.out.println(ans - n);
    }
    else{
        System.out.println(0);
    }
}    
}
