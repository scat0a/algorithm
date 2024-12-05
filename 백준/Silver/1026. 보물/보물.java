import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i]= sc.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }

        int result = 0;
        for (int step = 0; step < N; step++) {
            int maxA = Integer.MIN_VALUE;
            int maxAIndex = -1;
            for (int i = 0; i < N; i++) {
                if (A[i] > maxA) {
                    maxA = A[i];
                    maxAIndex = i;
                }
            }

            int minB = Integer.MAX_VALUE;
            int minBIndex = -1;
            for (int i = 0; i < N; i++) {
                if (B[i] < minB) {
                    minB = B[i];
                    minBIndex = i;
                }
            }

            result += maxA * minB;

            A[maxAIndex] = -1;
            B[minBIndex] = Integer.MAX_VALUE;
        }

        System.out.println(result);
    }
}