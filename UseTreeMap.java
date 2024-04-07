package paiza;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UseTreeMap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            TreeMap<Integer, String> dict = new TreeMap<>();
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                int nu = Integer.parseInt(sc.next());
                dict.put(nu,s);//キーを数字にする
            }
            for(Map.Entry<Integer,String> entry : dict.entrySet()){
                System.out.println(entry.getValue());
            }
        }
    }
}

