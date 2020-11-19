public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  /*
  *Return the sum of this and the other
  */
  public RealNumber add(RealNumber other){
    double val = getValue() + other.getValue();
    value = val;
    return this;
  }

  /*
  *Return the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
        return null;
  }

  /*
  *Return the this divided by the other
  */
  public RealNumber divide(RealNumber other){
        return null;
  }

  /*
  *Return the this minus the other
  */
  public RealNumber subtract(RealNumber other){
    return null;
  }


  public double getValue(){
    return value;
  }

  public boolean equals(RealNumber other){
     return true;
   }

  public String toString(){
    return ""+value;
  }
}
