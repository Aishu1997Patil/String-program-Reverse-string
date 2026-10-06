public class Palindromestring {
    public static void main(String[] args) {
//        String s = "ayrawhsia";
//        String temp = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            temp += s.charAt(i);
//        }
//        if (s.equals(temp)) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
//        }

        String s = "aisia";
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            if (ch[i] != ch[j]) {
                System.out.println("Not Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
