import java.util.Scanner;

public class GWI{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HelperClass helperClass = new HelperClass();
        for(int i = 0; i < n; i++){
            helperClass.chooseWinner(sc.nextInt());
        }

    }

    private static class HelperClass{

        void chooseWinner(int number){
            if(((number+1)%3 == 0) || ((number-1)%3 == 0))
                System.out.println("First");

            else
                System.out.println("Second");
        }
    }
}