public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other RealNumber
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    if(equals(other)) {
      return 0;
    }
    double dif = getValue()-other.getValue();
    if(dif>0) {
      return 1;
    }
    return -1;
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    double thisVal = getValue();
    double otherVal = other.getValue();
    if(thisVal==0.0 || otherVal==0.0) {
      return thisVal==otherVal;
    }
    double dif = Math.abs(thisVal-otherVal);
    return (dif/thisVal)<=(thisVal*0.00001) && (dif/otherVal)<=(otherVal*0.00001);
   }
}
