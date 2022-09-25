import java.util.Scanner;

public class Odd_EvenBack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int n1 = sc.nextInt();
            boolean check = true;

            int sum1 = 0, sum2 = 0, c = 0, rem = 0;

            while (n1 > 0) {
                rem = n1 % 10;
                if (check) {
                    sum1 = sum1 + rem;
                    check = false;
                } else {
                    sum2 = sum2 + rem;
                    check = true;
                }
                c++;
                n1=n1/10;
            }
            if (c % 2 == 0) {
                if (sum1 % 4 == 0 || sum2 % 3 == 0)
                    System.out.println("Yes");
                else
                    System.out.println("No");

            } else {
                if (sum1 % 3 == 0 || sum2 % 4 == 0)
                    System.out.println("Yes");
                else
                    System.out.println("No");

            }
            n--;
        }

    }
}
