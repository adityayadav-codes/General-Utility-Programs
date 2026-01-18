import java.util.Scanner;
public class Prog {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        x = sc.nextInt();
        if(x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
        sc.close();
    }
}
