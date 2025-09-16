import java.util.*;

public class ISOAEP {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int people = sc.nextInt();
    int a = 0 ;
    for(int i = 0; i < people; i++)
    {
        a = sc.nextInt();
        if(a == 1)
        {
            System.out.println("HARD");
            return;
        }
    }
    System.out.println("EASY");
}    
}
