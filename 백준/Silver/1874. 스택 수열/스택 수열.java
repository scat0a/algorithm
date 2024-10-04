import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        List<String> list = new ArrayList<>();
        int cnt = sc.nextInt();
        int[] array = new int[cnt + 1];
        int m = 1;
        for (int i = 1; i <= cnt; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 1; i <= cnt; i++) {
            stack.push(i);
            list.add("+");
            while (!stack.empty() && stack.peek() == array[m]) {
                stack.pop();
                list.add("-");
                m++;
            }
        }

        if (stack.empty()) {
            for (String s : list) {
                System.out.println(s);
            }
        }
        if (!stack.empty()) {
            System.out.println("NO");
        }
    }
}

