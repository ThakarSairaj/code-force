import java.util.*;

public class Magnets {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();
    int prev = 0;
    int curr = sc.nextInt();
    int cntr = 0;
    for(int i = 1; i < total; i++)
    {
        prev = curr;
        curr = sc.nextInt();
        if(prev == curr)
        {
            cntr++;
        }
    }
    System.out.println(cntr);
    }
}
