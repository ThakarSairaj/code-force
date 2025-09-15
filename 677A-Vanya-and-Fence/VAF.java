import java.util.Scanner;

public class VAF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int height = sc.nextInt();

        int current = 0;
        int roadWidth = 0;
        int cntr = 0;
        int remain = 0;
        for(int i = 0; i < friends; i++)
        {
            current = sc.nextInt();
            if(current > height)
            {
                roadWidth+=2;
                cntr++;
            }
        }
        remain = friends - cntr;
        for(int i = 0; i < remain; i++)
        {
            roadWidth++;
        }

        System.out.println(roadWidth);
    }
}
