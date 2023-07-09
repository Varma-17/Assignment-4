public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "2552";
        int l=0,r=str.length()-1;
        int flag=1;
        while(l<=r)
        {
            if(str.charAt(l) == str.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Yes, 2552 is Palindrome");
        }
        else
        {
            System.out.println("No, 2552 is not a Palindrome");
        }
    }   
}
