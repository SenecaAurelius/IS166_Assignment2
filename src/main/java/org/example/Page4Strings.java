package org.example;

public class Page4Strings {
    public static void main(String[] args) {

        String s1 = new String("testing");
        String s2 = new String("testing");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        s1.replace("t", "q");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.substring(4));
        String s = "different";
        System.out.println(s.trim());
        s.trim();
        System.out.println(s.indexOf("f"));
        s.indexOf("f");
    }


}
