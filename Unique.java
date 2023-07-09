import java.util.HashMap;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();
        int flag = 0;

        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i)))
            {
                flag = 1;
                break;
            }
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }
        if(flag == 1)
        {
            System.out.println("No, The given String doesn't contain all Unique characters");
        }
        else
        {
            System.out.println("Yes, The given String contain all unique characters");
        }
    }
}
