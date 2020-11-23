public class RealNumber{
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

  public boolean equals(RealNumber other){
    double thisVal = getValue();
    double otherVal = other.getValue();
    if(thisVal==0.0 || otherVal==0.0) {
      return thisVal==otherVal;
    }
    double dif = Math.abs(thisVal-otherVal);
    return (dif/thisVal)<=(thisVal*0.00001) && (dif/otherVal)<=(otherVal*0.00001);
   }

  public String toString(){
    return ""+value;
  }
}
