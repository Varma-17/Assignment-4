import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int arr[] = new int[26];
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
            {
                arr[(int)str.charAt(i)-97]++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("The given string is not a Pangram");
        }
        else
        {
            System.out.println("The given string is a Pangram");
        }
    }
}
