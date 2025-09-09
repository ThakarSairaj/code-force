import java.util.Scanner;

public class SOTT {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    
    int cntr = 0;
    for(int i = 0; i < n - 1; i++)
    {
        if(s.charAt(i) == s.charAt(i+1))
        {
           cntr++;
            
        }
    }
    System.out.println(cntr);

}    
}
