public class Vowels {
    public static void main(String[] args) {
        String str="documentation";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='u'||str.charAt(i)=='i'||str.charAt(i)=='o'){
             count++;
       }
        }
        System.out.println("The total number of vowels in this is: "+count);
    }
}
