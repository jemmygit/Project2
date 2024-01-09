package Project2;
/*
Find out how many alpha characters are present in a string?
 */
public class T2 {
    public static void main(String[] args) {
        String s = "Project Two ";
        int count =0;
        for(int i = 0; i<s.length(); i++){
         char c = s.charAt(i);
         if (Character.isLetter(c)){
             count++;
         }
        }
        System.out.println("The numbers of Alpha Characters are "+count);

    }
}
