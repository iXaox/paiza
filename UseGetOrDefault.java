package paiza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class UseGetOrDefault {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String[] str = {"HND", "NRT", "KIX", "NGO", "NGO", "NGO", "NGO", "NGO"};
            Map<String, Integer> map = new HashMap<>();
            for(String s : str){
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
            map.entrySet().stream().filter(e ->e.getValue() > 1).forEach(e -> System.out.println(e.getValue()));
        }
    }
}
