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
    double val = getValue() * other.getValue();
    value = val;
    return this;
  }

  /*
  *Return the this divided by the other
  */
  public RealNumber divide(RealNumber other){
    double val = getValue() / other.getValue();
    value = val;
    return this;
  }

  /*
  *Return the this minus the other
  */
  public RealNumber subtract(RealNumber other){
    double val = getValue() - other.getValue();
    value = val;
    return this;
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
    return (dif/thisVal)<=(thisVal*0.0001) && (dif/otherVal)<=(otherVal*0.0001);
   }

  public String toString(){
    return ""+value;
  }
}
