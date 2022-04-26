package Basics;

public class stringex {
    public static void main(String[] args) {
        String s = "AnilKumar Gaduthotti";

        // length = 20, 0-19
        System.out.println(s.length());
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.substring(0,10));
        System.out.println(s.indexOf("K"));
        System.out.println(s.lastIndexOf("i"));
        System.out.println(s.equals("AnilKumar Gaduthotti"));
        System.out.println(s.replace("AnilKumar", "AnilKumar."));


        String[] sarr = s.split(",");

        for (String str : sarr) {
            System.out.println(str);
        }
        System.out.println(reverse(s));
    }

    public static String reverse(String s){
        String str = "";
        for (int i = s.length() - 1; i > 0 ; i--) {
            str += s.charAt(i);
        }
        return str;
    }
}
