import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] note = new int[8];

        for (int i = 0; i < 8; i++) {
            note[i] = sc.nextInt();
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < 7; i++) {
            if(note[i] < note[i+1]){
                isDescending = false;
            }
            if(note[i] > note[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("ascending");
        }else if(isDescending){
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }


    }
}
