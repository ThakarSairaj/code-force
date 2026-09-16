import java.util.Scanner;

public class TNYMF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();


        HelperClass helperClass = new HelperClass();
        int res = helperClass.getDistance(x1, x2, x3);
        System.out.print(res);
    }

    private static class HelperClass {

        int getDistance(int x1, int x2, int x3){
            return Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3));
        }

    }
}
