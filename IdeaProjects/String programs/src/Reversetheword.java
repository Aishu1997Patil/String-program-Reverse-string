public class Reversetheword {
    public static void main(String[] args) {
        String s = "Welcome to the world of programming";
        String[] s1 = s.split(" ");
        String temp = "";
        for (int i = s1.length - 1; i >= 0; i--) {
            temp += s1[i] + " ";
        }
           temp=temp.trim();
           System.out.println(temp.trim());
    }
}
