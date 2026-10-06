public class Balancedstring {
    public static void main(String[] args) {
//        String s = "AaBb";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (Character.isUpperCase(ch)) {
//                count++;
//            } else if (Character.isLowerCase(ch)) {
//                count--;
//            }
//        }
//        if (count == 0) {
//            System.out.println("The string is balanced.");
//        } else {
//            System.out.println("The string is not balanced.");
//        }

        String s = "aAbB";
        int upper = 0, lower = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
        }
        if (upper == lower)
            System.out.println("Balanced String");
        else
            System.out.println("Not Balanced String");
    }
}
