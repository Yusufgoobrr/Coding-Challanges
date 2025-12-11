package PalindromeNumber;

public class PalindromeNumber {
    static void main() {
        System.out.println(isPalindrome(5555));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0){ return false;}
        else{
         int rev = 0;
         int temp=x;
         while(temp!=0){
             rev = rev * 10 + temp % 10;
             temp/=10;
         }
         if(x==rev){
             return true;
         }else {
             return false;
         }
        }

    }

}
