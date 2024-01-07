public class StringSwap {
    //Write a program to swap 2 String without temporary variable.
    public static void main(String[] args) {
        String str1="Quality";
        String str2="Assurance";
        System.out.println("Before swapping two strings:  ");
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        System.out.println("***********************************************************");


        str1=str1+str2;
        str2=str1.substring(0, str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("After swapping two strings:  ");
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);



            }
}
