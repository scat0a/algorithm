import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oxCount = sc.nextInt();
        // OOXXOXXOOO
        // 1 2 0 0 1 0 0 1 2 3
        sc.nextLine();
        for (int i = 0; i < oxCount; i++) {
            String input = sc.nextLine();
            int count = 0;
            int sum =0;

            for (char s : input.toCharArray()) {
                if(s == 'X'){
                    count = 0;
                }
                if(s == 'O'){
                    count++;
                    sum +=count;
                }
            }
            System.out.println(sum);
        }


    }
}
