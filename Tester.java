public class Tester {
  public static void main(String[] args) {
    RealNumber a = new RealNumber(0.6);
    RealNumber b = new RealNumber(0.8);
    RealNumber c = new RealNumber(-1.5);
    a.add(b);
    System.out.println(a);
    a.subtract(b);
    System.out.println(a);
    a.add(c);
    System.out.println(a);
    a.subtract(c);
    System.out.println(a);
  }
}
