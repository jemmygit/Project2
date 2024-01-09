package Project2;
/*
We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code

 */
public abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks{
    private final double subject1;
    private final double subject2;
    private final double subject3;

    A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    @Override
    double getPercentage() {
        double totalMarks=subject1+subject2+subject3;
        return totalMarks/3 ;
    }
}
class B extends Marks{
    private final double subject1;
    private final double subject2;
    private final double subject3;
    private final double subject4;


    B(double subject1, double subject2, double subject3,double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4=subject4;
    }
    @Override
    double getPercentage() {
        double totalMarks=subject1+subject2+subject3+subject4;
        return totalMarks/4 ;
    }
}

