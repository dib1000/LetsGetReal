public class Tester {
  public static void main(String[] args) {
    //Testing realNumber operations

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
  }
}
