public class StringReverse
{
    public static void main(String[] args) {
        /* Reverse a String:Write a function to reverse a given String.For example, given the input "Hello"
        the output should be "olleH"
         */
        String str="Hello World";
        String [] words=str.split(" ");
         for(String w:words){
            for (int i=w.length()-1;i>=0; i--) {
                System.out.print(w.charAt(i));
        }
             System.out.print(" ");

        }
    }
}
