package paiza;

import java.util.*;

public class UseComparingByValue {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            sc.nextLine();
            Map<String,Integer> map = new HashMap<>();
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.nextLine();
                String[] split = str[i].split(" ");
                String key = split[0];
                Integer value = Integer.valueOf(split[1]);
                map.put(key,map.getOrDefault(key,0) + value);
            }
            map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEach(e -> System.out.println(e.getKey() + " " +e.getValue()));
        }
    }
}
