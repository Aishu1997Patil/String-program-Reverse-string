public class Reversestring {

    public static void main(String[] args){
//        String s = "ayrawhsia";
//        String temp="";
//        for(int i=s.length()-1;i>=0;i--){
//            temp += s.charAt(i);
//        }
//        System.out.println(temp);

        String s= "ayrawhsiA";
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        System.out.println(new String(ch));
    }
}

