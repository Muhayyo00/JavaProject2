public abstract class Marks {

 /*We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code
         */


     abstract double getPercentage();
}
class A extends Marks {

    private double sA1;
    private double sA2;
   private double sA3;

    public A(double sA1, double sA2, double sA3) {

        this.sA1 = sA1;
        this.sA2 = sA2;
        this.sA3 = sA3;}

        @Override
    double getPercentage() {return((sA1+sA2+sA3)/3);}}


class B extends Marks {

    private double sB1;
    private double sB2;
    private double sB3;
    private double sB4;

    public B(double sB1, double sB2, double sB3, double sB4) {

        this.sB1 = sB1;
        this.sB2 = sB2;
        this.sB3 = sB3;
        this.sB4 = sB4;
    }

    @Override
    double getPercentage() {
        return (sB1 + sB2 + sB3 + sB4) / 4.0;
    }

    public static void main(String[] args) {
        A a = new A(76, 89, 80);
        a.getPercentage();
        System.out.println("The average of marks obtained by student A in 3 subjects is: " +a.getPercentage());
        B b = new B(89, 66.5, 90, 76);
        b.getPercentage();
        System.out.println("The average of marks obtained by student B in 4 subjects is: " + b.getPercentage());

    }}


