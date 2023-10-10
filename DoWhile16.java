import java.util.Scanner;
public class DoWhile16 {
    public static void main(String[] args){
        Scanner sc16 =new Scanner(System.in);

        int x = 0;

        do {
            System.out.println(x);
        } while (++x <= 8);
        System.out.println("Program berhenti");
    }
}