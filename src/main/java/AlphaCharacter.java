public class AlphaCharacter {
    public static void main(String[] args) {

        // FInd out how many alpha characters are present in a String?

        String str = "Syntax Technologies#1234";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' ') {
                count++;

            }
        }
        System.out.println(count);
    }



}
