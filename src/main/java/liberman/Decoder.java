package liberman;

import javax.swing.plaf.IconUIResource;

public class Decoder {
    public String checkPalindrome(String str) {
        char[] chars = str.replaceAll(" ", "").toLowerCase().toCharArray();
        int charsLength = chars.length;

        char[] reverseChars = new char[charsLength];
        int currentIndex = charsLength - 1;

        for (int i = 0; i < charsLength; i++) {
            reverseChars[i] = chars[currentIndex - i];
        }

        boolean isEquals = true;
        for (int i = 0; i < charsLength; i++) {
            if (chars[i] == reverseChars[i]) {
                continue;
            }
            isEquals = false;
        }

        if(isEquals){
            System.out.println("This word is palindrome");
            return str.replaceAll(" ", "");
        }
        return null;
    }

    public static void main(String[] args) {
        Decoder decoder = new Decoder();
        System.out.println(decoder.checkPalindrome("k A K"));
    }
}
