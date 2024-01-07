public class WordsNumber {
    public static void main(String[] args) {
      /*Count the Number of Words in a String: Write a function to count the number of words
      in a given string. Words are separated by spaces or punctuation. For example,
      the input "Hello, world!" should return 2.
       */

        String str="Hello, world!";
        String[]arr=str.split("[\\s.,!?]+");

        System.out.println("Number of words in a string is: "+arr.length);
    }
}
