public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  /*
  *Return the sum of this and the other
  */
  public RealNumber add(RealNumber other){
    RealNumber n = new RealNumber(getValue()+other.getValue());
    return n;
  }

  /*
  *Return the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    RealNumber n = new RealNumber(getValue()*other.getValue());
    return n;
  }

  /*
  *Return the this divided by the other
  */
  public RealNumber divide(RealNumber other){
    RealNumber n = new RealNumber(getValue()/other.getValue());
    return n;
  }
  /*
  *Return the this minus the other
  */
  public RealNumber subtract(RealNumber other){
    RealNumber n = new RealNumber(getValue()-other.getValue());
    return n;
  }


  public double getValue(){
    return value;
  }


  public String toString(){
    return ""+value;
  }
}
