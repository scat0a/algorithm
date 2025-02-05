import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split("");

        for (String s : inputs) {
            System.out.println((int)s.charAt(0));
        }
    }
}
