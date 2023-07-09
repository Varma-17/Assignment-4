import java.util.*;

public class MaxOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }
        int max = 0;
        char res = ' ';
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) > max)
            {
                max = map.get(str.charAt(i));
                res = str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
