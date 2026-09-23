package String;

public class stringMethod {
        public static void main(String[] args) {

            String str = "Hello Java";
            String str1 = "Hello JAVA";
            System.out.println(str.length());       // length
            System.out.println(str.equals(str1));   // equal
            System.out.println(str.equalsIgnoreCase(str1)); // equalsIgnoreCase
            System.out.println(str.charAt(1));      // character at index
            System.out.println(str.toUpperCase());  // uppercase
            System.out.println(str.toLowerCase());  // lowercase
            System.out.println(str.substring(0, 5)); // part of string
            System.out.println(str.contains("Java")); // check
            System.out.println(str.indexOf("Java"));  // find index
            System.out.println(str.replace("Java", "World")); // replace
        }
    }

