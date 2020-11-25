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

  }
}
