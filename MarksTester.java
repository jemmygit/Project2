package Project2;

public class MarksTester {
    public static void main(String[] args) {
        A studentA = new A(60,70,80);
        B studentB = new B(70,80,90,95);
        double percentageA=studentA.getPercentage();
        double percentageB= studentB.getPercentage();
        System.out.println("Students A average percentage: "+percentageA);
        System.out.println("Students B average percentage: "+percentageB);
    }
}
