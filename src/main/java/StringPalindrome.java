public class StringPalindrome {
    public static void main(String[] args) {
        /*Check if a String is Palindrome: Determine whether a given String is a palindrome, which means
        it reads the same forwards and backwards. For example, "madam" is a palindrome.
         */

    String word="madam";
        String reverseword="";
        for (int i = word.length()-1;i>=0; i--) {
        reverseword+=word.charAt(i);
        if(word.equalsIgnoreCase(reverseword)) {
            System.out.println(word+" is a Palindrome");
        }else{
            System.out.println(word+" is not a Palindrome");

    }}
}}
