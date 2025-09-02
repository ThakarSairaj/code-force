import java.util.*;
public class Team {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOfProblems = sc.nextInt();
    int counter = 0;
    int knowProblems = 0;
    int inter = 0;

    for(int i = 0; i < numOfProblems; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            knowProblems = sc.nextInt();
            if(knowProblems == 1)
            {
                inter++;
            }
        }
        if(inter >= 2)
        {
            counter++;
        }
        inter = 0;
    }
    System.out.println(counter);
  }  
}
