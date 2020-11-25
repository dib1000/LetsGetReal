public class NumberTester{
  public static void main(String[] args) {
    RealNumber a = new RealNumber(0.0);
    RealNumber b = new RealNumber(Math.PI);
    RealNumber c = new RealNumber(0.6);
    RationalNumber ra = new RationalNumber(0,10000);
    RationalNumber rb = new RationalNumber(355,113);
    RationalNumber rc = new RationalNumber(60,100);
    System.out.println("TESTING EQUALS METHODS");
    System.out.println();
    System.out.println(a.equals(ra));
    System.out.println(a.equals(rb));
    System.out.println(a.equals(rc));
    System.out.println(b.equals(rb));
    System.out.println(b.equals(ra));
    System.out.println(b.equals(rc));
    System.out.println(c.equals(rc));
    System.out.println(c.equals(ra));
    System.out.println(c.equals(rb));
    System.out.println();

    System.out.println("TESTING COMPARES METHOD");
    System.out.println(b.compareTo(rb));
    System.out.println(b.compareTo(ra));
    System.out.println(c.compareTo(rb));
    System.out.println(b.compareTo(b));
    System.out.println(b.compareTo(a));
    System.out.println(c.compareTo(b));
    System.out.println(rb.compareTo(rb));
    System.out.println(rb.compareTo(ra));
    System.out.println(rc.compareTo(rb));
    System.out.println();

    System.out.println("TESTING RationalNumber toString()");
    System.out.println();
    System.out.println("Testing 0 numerator");
    RationalNumber z = new RationalNumber(0,2);
    RationalNumber nz = new RationalNumber(0,-2);
    System.out.println(z);
    System.out.println(nz);
    System.out.println();
    System.out.println("Testing 1 denominator");
    RationalNumber d = new RationalNumber(5,1);
    RationalNumber e = new RationalNumber(-5,1);
    RationalNumber f = new RationalNumber(5,-1);
    RationalNumber g = new RationalNumber(-5,-1);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
  }
}
