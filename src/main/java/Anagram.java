import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {

    /* Check if two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning they
    contain the same characters in a different order. For example, "listen" and "silent" are anagrams.
     */
        //1. delete all the white spaces
        String str1=s1.replaceAll("\\s", "");
        String str2=s2.replaceAll("\\s", "");

        //2.check if their length is same or not. If not, no need to go further
            if(str1.length()!=(str2.length())){
               return false;
            }else{
                char []chArray1=str1.toLowerCase().toCharArray();
                char []chArray2=str2.toLowerCase().toCharArray();
                Arrays.sort(chArray1);
                Arrays.sort(chArray2);
                return Arrays.equals(chArray1,chArray2);}}

    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent"));
        System.out.println(isAnagram("Listen", "Si Lent"));
        System.out.println(isAnagram("Listen", "LISTEN"));
        System.out.println(isAnagram("Act", "Pack"));


    }}
