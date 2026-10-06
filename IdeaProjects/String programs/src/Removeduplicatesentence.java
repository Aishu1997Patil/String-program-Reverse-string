public class Removeduplicatesentence {
    public static void main(String[] args){
        String s = "Welcome to the world of Java programming Welcome to the world of Java programming";
        String temp="";
        String[] s1 = s.split(" ");
        for(int i=0;i<s1.length;i++){
            if(!temp.contains(s1[i]+" ")){
                temp += s1[i]+" ";
            }
        }
        temp=temp.trim();
        System.out.println(temp);
    }
}
