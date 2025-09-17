import java.util.Scanner;

public class GAA {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();
    int cntr = 0;

    int pi = 0;
    int qi = 0;
    
    for(int i = 0; i < total; i++)
    {
        pi = sc.nextInt();
        qi = sc.nextInt();
     

        if(qi - pi > 1)
        {
            cntr++;
        }
    }
    System.out.println(cntr);
  }  
}
