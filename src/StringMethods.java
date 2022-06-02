public class StringMethods {
    public static void main(String[] args) {
        String str = "Cydeo";   //literally
        System.out.println("str => " + str);
        System.out.println("str.charAt(2): => " + str.charAt(2));
        System.out.println("******************************************");
        
        String str1 = "Cydeo";
        String str2 = new String("Cydeo");  //new keyword = > object
        System.out.println("str1 => " + str1);
        System.out.println("str2 => " + str2);
        System.out.println("str1.equals(str2) => " + str1.equals(str2));
        System.out.println("******************************************");
        
        String str4 = "Java";
        System.out.println("str4 => " + str4);
        System.out.println("str4.toLowerCase() => " + str4.toLowerCase());//java
        System.out.println("str4 => " + str4);//Java // STRING CLASS IS IMMUTABLE!!!!!!!!!!!!!!!!!!!
        System.out.println("str4 did not change, bec String class is IMMUTABLE");
        System.out.println("******************************************");
        
        String str5 = "Spring";
        System.out.println("str5 => " + str5);
        System.out.println("str5.toUpperCase() => " + str5.toUpperCase());//SPRING
        System.out.println("str5 => " + str5);//Spring STRING CLASS IS IMMUTABLE!!!!!!!!!!!!!!!!!!!
        System.out.println("str5 did not change, bec String class is IMMUTABLE");
        System.out.println("******************************************");
        
        String str6 = "Java";
        System.out.println("str6 => " + str6);
        System.out.println("str6.length() => " + str6.length());
        System.out.println("******************************************");
        
        String str7 = " Java   programming   ";
        System.out.println("str7 => " + str7);
        System.out.println("str7.trim() => " + str7.trim());
        System.out.println("******************************************");
        
        String str8 = "Cydeo";
        System.out.println("str8 => " + str8);
        System.out.println("str8.indexOf(\"o\") => " + str8.indexOf("o"));
        System.out.println("******************************************");
        
        String str9 = "Java";
        System.out.println("str9 => " + str9);
        System.out.println("str9.lastIndexOf(\"e\") => " + str9.lastIndexOf("e"));
        System.out.println("******************************************");
        
        String str11 = "YeS";
        String str12 = new String("yes");
        System.out.println("str11 => " + str11);
        System.out.println("str12 => " + str12);
        System.out.println("str11.equalsIgnoreCase(str12) => " + str11.equalsIgnoreCase(str12));
        System.out.println("******************************************");
        
        String str13 = "zero To Hero";
        System.out.println("str13 => " + str13);
        System.out.println("str13.replace(\" \", \"\") => " + str13.replace(" ", ""));
        System.out.println("******************************************");
        
        String str14 = "Java is fun, Java is cool";
        System.out.println("str14 => " + str14);
        System.out.println("str14.replaceFirst(\"Java\", \"Python\") => " + str14.replaceFirst("Java", "Python"));
        System.out.println("******************************************");
        
        String str15 = "Zero To Hero";
        System.out.println("str15 => " + str15);
        System.out.println("str15.substring(8,11) => " + str15.substring(8,11));
        System.out.println("******************************************");
        
        String str16 = "Hero";
        System.out.println("str16 => " + str16);
        System.out.println("str16.repeat(2) => " + str16.repeat(2));
        System.out.println("******************************************");
        
        String str17 = "zero To Hero";
        System.out.println("str17 => " + str17);
        System.out.println("str17.isEmpty() => " + str17.isEmpty());
        System.out.println("******************************************");
        
        String str18 = "      ";
        System.out.println("str18 => " + str18);
        System.out.println("str18.isBlank() => " + str18.isBlank());
        System.out.println("******************************************");
        
        String str19 = "Zero To Hero";
        System.out.println("str19 => " + str19);
        System.out.println("str19.contains(\"Hero\") => " + str19.contains("Hero"));
        System.out.println("******************************************");
        
        String str20 = "www.cydeo.com";
        System.out.println("str20 => " + str20);
        System.out.println("str20.startsWith(\"www.\") => " + str20.startsWith("www."));
        System.out.println("******************************************");
        
        String str21 = "www.cydeo.com";
        System.out.println("str21 => " + str21);
        System.out.println("str21.endsWith(\".com\") => " + str21.endsWith(".com"));
    }
}
