import java.util.ArrayList;

public class StringWIthA {
    public static void main(String[] args) {
        /*You have a list of strings and want to keep only those that start with
          “A” and you want to return them in lower case*/

        ArrayList<String>arr=new ArrayList<>();
        arr.add("Aflesun");
        arr.add("Bihi");
        arr.add("Tut");
        arr.add("Anjir");
        arr.add("Seb");
        arr.add("Olu");
        arr.add("Nok");
        arr.add("Khurmo");
        arr.add("Anor");


        for (int i = 0; i <arr.size() ; i++) {
         //   if(arr.get(i).charAt(0)=='A'){
           //     System.out.println(str[i].toLowerCase());
            if(arr.get(i).startsWith("A")){
                System.out.println(arr.get(i).toLowerCase());
            }
        }
            }





    }






