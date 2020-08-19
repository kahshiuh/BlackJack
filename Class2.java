import java.util.Scanner;
public class Class2 {
    public static void main(String[] args) {
        int tOne = 9;
        Scanner input = new Scanner(System.in);
        System.out.println(tOne);
        System.out.println("What is the value of tOne?");
        tOne = input.nextInt();
        System.out.println(tOne);
    }
}