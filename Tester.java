public class Tester {
  public static void main(String[] args) {

    System.out.println("Testing realNumber operations");
    RealNumber a = new RealNumber(0.6);
    RealNumber b = new RealNumber(0.8);
    RealNumber c = new RealNumber(-1.5);
    a.add(b);
    System.out.println(a); //1.4
    a.subtract(b);
    System.out.println(a); //0.6
    a.add(c);
    System.out.println(a); //-0.9
    a.subtract(c);
    System.out.println(a); //0.6
    b.multiply(a);
    System.out.println(b); //0.48
    b.divide(a);
    System.out.println(b); //0.6
    c.multiply(a);
    System.out.println(c); //-0.9
    c.divide(a);
    System.out.println(c); //-1.5
    c.multiply(c);
    System.out.println(c); //2.25
    c.divide(c);
    System.out.println(c); //1.0
    System.out.println();

    System.out.println("Testing get methods");
    System.out.println();
    System.out.println("Testing get RealNumber methods");
    RealNumber x = new RealNumber(0.4324235);
    RealNumber y = new RealNumber(5.343553494943883248234);
    System.out.println(x.getValue());
    System.out.println(y.getValue());
    System.out.println();
    System.out.println("Testing get RationalNumber methods");
    RationalNumber f = new RationalNumber(3,5);
    RationalNumber nf = new RationalNumber(-5,3);
    System.out.println(f.getNumerator()); //3
    System.out.println(f.getDenominator()); //5
    System.out.println(f.getValue()); //0.6
    System.out.println(nf.getNumerator()); //-5
    System.out.println(nf.getDenominator()); //3
    System.out.println(nf.getValue()); //1.6666667
    System.out.println();

    System.out.println("Testing equals methods");
    System.out.println();
    RealNumber zero = new RealNumber(0.0);
    RealNumber z = new RealNumber(0.0);
    RealNumber d = new RealNumber(0.6);
    RealNumber t = new RealNumber(0.43);
    RationalNumber ze = new RationalNumber(0,1);
    System.out.println("equals with zero");
    System.out.println(zero.equals(d)); //false
    System.out.println(zero.equals(z)); //true
    System.out.println(d.equals(zero)); //false
    System.out.println(ze.equals(d)); //false
    System.out.println(ze.equals(z)); //true
    System.out.println(d.equals(ze)); //false
    System.out.println(z.equals(ze)); //true
    System.out.println();
    System.out.println("equals without zero");
    System.out.println(d.equals(a)); //true
    System.out.println(d.equals(b)); //false
    System.out.println(c.equals(d)); //false
    System.out.println(t.equals(x)); //false
    System.out.println();
    System.out.println("equals with RationalNumber");
    System.out.println(nf.equals(a)); //false
    System.out.println(f.equals(a)); //true
    System.out.println(a.equals(nf)); //false
    System.out.println(a.equals(f)); //true
    System.out.println();
    System.out.println("equals with two RationalNumbers");
    RationalNumber ef = new RationalNumber(3,5);
    RationalNumber rf = nf.reciprocal();
    System.out.println(ef.equals(f)); //true
    System.out.println(ef.equals(nf)); //false
    System.out.println(ef.equals(rf)); //false
    System.out.println();

    System.out.println("Testing reciprocal");
    f.reciprocal();
    nf.reciprocal();
    System.out.println(f.getNumerator()); //5
    System.out.println(f.getDenominator()); //3
    System.out.println(f.getValue()); //1.6666667
    System.out.println(nf.getNumerator()); //3
    System.out.println(nf.getDenominator()); //-5
    System.out.println(nf.getValue()); //-0.6
  }
}
