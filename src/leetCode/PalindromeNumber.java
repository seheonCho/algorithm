package leetCode;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        String str = Integer.toString(x);

        StringBuilder sb = new StringBuilder(str);
        String reverseX = sb.reverse().toString();

        if (str.equals(reverseX))
            return true;
        else
            return false;

    }

}
