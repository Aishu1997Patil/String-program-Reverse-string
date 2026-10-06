public class Panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        s = s.toLowerCase();
        for(int i='a'; i<='z'; i++) {
            char ch = (char) i;
            if (!s.contains(ch + "")) {
                System.out.println("Not a panagram");
                return;
            }
        }
        System.out.println("Panagram");
    }
}
