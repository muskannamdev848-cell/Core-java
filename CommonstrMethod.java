package String;

public class CommonstrMethod {
    void main() {
        String name = "Muskan Namdev";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.substring(2, 4));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("sk"));

        System.out.println(name.startsWith("M"));
        System.out.println(name.endsWith("N"));

        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));


        String name1 = "";
        System.out.println(name1.isEmpty());
        System.out.println(name1.isBlank());


        String name2 = "MUSKAN ";
        System.out.println(name2.repeat(3));


        //its not working
        System.out.println(name1.concat(name2));

        if (name.equals(name2)) {
            System.out.println("Both names are equals ");
        }else{
            System.out.println("They are not equal .");
        }

        if(name.equalsIgnoreCase(name2)){
            System.out.println("Both are Same Name .");
        }else{
            System.out.println("They both  names are completely different. ");
        }

        String name3 = "   Ommjii123      ";
        System.out.println(name3.trim());     //trim ==strip
        System.out.println(name3.replace('i','e'));
        System.out.println(name3.replaceAll("[0-9]",""));
        System.out.println(name3.replaceFirst("m","o"));



       //this is also not working
        String input = "Java ,SpringBoot , MySQL";
        String[] words = input.split(",");
        for(String str1 :words){
            System.out.println(str1);
        }

        //System.out.println(num.matches("[0-9]+ "));

    }


}
