package org.java.core.codebase;

public class DivideStringIntoEqualParts {
    public static void main(String[] args) {
        String s = "HelloWorld";
//        System.out.println("Lenght of String "+s.length());
        String firts_part=(String) s.subSequence(0, s.length() / 2);
        String second_part=(String) s.subSequence((s.length() / 2),s.length() );

        for(int i=0;  i< s.length(); i++){
            System.out.println("Chart At ["+i+"]#"+s.charAt(i));
        }

        if(s.length()%2==0){
            System.out.println(firts_part +" : "+ second_part);
        }

    }

}
