import java.util.HashMap;
import java.util.Scanner;

public class PrintDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i)))
            {
                System.out.print(str.charAt(i));
            }
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
        }
    }
}
