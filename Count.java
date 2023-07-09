import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int vowels = 0,consonants = 0, specialch = 0;
        // Using HashMap to avoid duplicate counting
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i)))
            {
                char ch = str.charAt(i);
                if(!((int)ch >= 65 && (int)ch <= 90 || (int)ch >= 97 && (int)ch <= 121))
                {
                    specialch++;
                }
                else if(ch == 'A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' || ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
            
        }
        System.out.println("Count of Special Characters : " + specialch);
        System.out.println("Count of Vowels : " + vowels);
        System.out.println("Count of Consonants : " + consonants);
    }
}
