package paiza;

import java.util.Scanner;

public class UseChar {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            char start = s.charAt(0);
            char end = s.charAt(s.length() - 1);
            for (char c = start; c <= end; c++) {
                System.out.println(c);
            }
        }
    }
}
