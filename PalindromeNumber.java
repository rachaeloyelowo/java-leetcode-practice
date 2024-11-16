public class PalindromeNumber{
    public boolean isPalindrome(int x) {

        int originalInt = x;
        int rev = 0;
        boolean p = false;

        if (x >= 0){
            while (x > 0){
                rev *= 10;
                rev += (x % 10);
                x /= 10;
            }

            if (rev == originalInt){
                p = true;
            }
        }
        return p;
    }
}