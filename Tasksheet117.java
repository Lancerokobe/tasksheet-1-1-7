import java.util.Scanner;

public class Tasksheet117 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int inp1 = scan.nextInt();
        int inp2 = scan.nextInt();
        int inp3 = scan.nextInt();
        System.out.println();
        
        if (inp1 == inp2 && inp1 == inp3){
            System.out.println("All numbers are equal");
        } else {
            if (inp1 > inp2 && inp1 > inp3) {
                num = inp1;
            } else if (inp2 > inp1 && inp2 > inp3){
                num = inp2;
            } else if (inp3 > inp1 && inp3 > inp2) {
                num = inp3;
            } 
            System.out.println(num);
        }
    }
}
