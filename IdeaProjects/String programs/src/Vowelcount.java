public class Vowelcount {
    public static void main(String[] args) {
//        String s = "Hello World";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
//                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
//                count++;
//            }
//        }
//        System.out.println("Number of vowels: " + count);


        String s = "aghsijertuplxvhs";
        String vowels = "AEIOUaeiou";
        int vowelCount = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (vowels.contains(c + "")) {
                vowelCount++;
            }

            System.out.println(vowelCount);
        }
    }
}