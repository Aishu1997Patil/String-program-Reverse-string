public class Anagram {
    public static void main(String[] args) {
        String s="silent";
        String s1="listen";
        char[] c=s.toCharArray();
        char[] c1=s1.toCharArray();
        java.util.Arrays.sort(c);
        java.util.Arrays.sort(c1);
        if(java.util.Arrays.equals(c,c1)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}
