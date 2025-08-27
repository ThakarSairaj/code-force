// package 4A-Watermelon;
import java.util.*;
public class WaterMelonProblem {
    
    static String isEven(float num)
    {
        if(num % 2 == 0 && num > 2)
        {
            return "YES";

        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(isEven(input));
            
    
    }
}
