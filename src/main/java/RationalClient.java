public class RationalClient {
    
    public static void main(String[] args) {
        Rational r = new Rational(1, 2);
        System.out.println(r);

        // We can use dot notation to access the integer values
        // of the numerator and denominator directly
        System.out.println(r.numerator);
        System.out.println(r.denominator);

        System.out.println("Non static method tests");
        System.out.println(r.isImproper()); // false
        System.out.println(new Rational(50, 2).isImproper()); // true
        System.out.println(new Rational(40,2).isSimplified());//false
        System.out.println(new Rational(13,4).isSimplified());//true
        System.out.println(new Rational(3, 8).calculateDecimalValue());//0.375
        System.out.println(new Rational(15, 3).calculateDecimalValue());//5.0
        System.out.println(new Rational(2,3).pow(3));//8/27
        System.out.println(new Rational(3,9).pow(1));//3/9
        System.out.println(new Rational(40,27).contains(27));//true
        System.out.println(new Rational(40,27).contains(28));//true
        Rational a = new Rational(4,5);
        a.increment();
        System.out.println(a); //9/5
        Rational b = new Rational(17,5);
        b.decrement();
        System.out.println(b); // 12/5
        Rational c = new Rational(2,3);
        c.changeToEquivalentFraction(21);
        System.out.println(c);//14/21
    }
}
