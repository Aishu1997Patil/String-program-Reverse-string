public class Countofalphabetsnumspecialsharcter {
    public static void main(String[] args) {
//        String s = "aishwarya@9901333###";
//        int alpha = 0, num = 0, special = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (Character.isLetter(c)) {
//                alpha++;
//            } else if (Character.isDigit(c)) {
//                num++;
//            } else {
//                special++;
//            }
//        }
//        System.out.println("Alphabets: " + alpha);
//        System.out.println("Numbers: " + num);
//        System.out.println("Special Characters: " + special);

        String s = "aishwarya@9901333###";
        int alpha = 0, num = 0, special = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 'a' && c < 'z' || c > 'A' && c < 'Z') {
                alpha++;
            } else if (c > '0' && c < '9') {
                num++;
            } else {
                special++;
            }
        }
        System.out.println("Alphabets: " + alpha);
        System.out.println("Numbers: " + num);
        System.out.println("Special Characters: " + special);
    }
}