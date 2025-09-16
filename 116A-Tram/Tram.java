
import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stations = sc.nextInt();
        if(stations == 0)
        {
            System.out.println(0);
            return;
        }
        
        int ai = 0;
        int bi = 0;
        int totalInTrain = 0;
        int temp = 0;
        int max = 0;

        for(int i = 0; i < stations; i++)
        {
            ai = sc.nextInt();
            bi = sc.nextInt();
            temp = Math.abs(ai - totalInTrain);
            totalInTrain = temp + bi;

            if(totalInTrain > max)
            {
                max = totalInTrain;
            }
        }

        System.out.println(max);

    }
}
