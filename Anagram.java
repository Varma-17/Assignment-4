import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2 : ");
        String str2 = sc.nextLine();
        int flag = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i), 0)+1);
        }

        for (int i = 0; i < str2.length(); i++) {
            if(!map.containsKey(str2.charAt(i)))
            {
                flag = 1;
                break;
            }
            else
            {
                map.put(str2.charAt(i),map.get(str2.charAt(i))-1);
                if(map.get(str2.charAt(i))==0)
                {
                    map.remove(str2.charAt(i));
                }
            }
        }
        if(flag == 1)
        {
            System.out.println("The given strings are not Anagrams");
        }
        else if(!map.isEmpty())
        {
            System.out.println("The given strings are not Anagrams");
        }
        else
        {
            System.out.println("The given strings are Anagrams");
        }
    }
}
