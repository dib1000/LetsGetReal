public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if(deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else {
      numerator = nume;
      denominator = deno;
      if(numerator!=0 && gcd(numerator,denominator)!=1 ) {
        reduce();
      }
    }
  }

  public double getValue(){
    return (double) numerator/denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    int storage = numerator;
    numerator = denominator;
    denominator = storage;
    return this;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator();
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if(denominator<0.0) {
      return numerator*-1 + "/" + denominator*-1;
    }
    else {
      return numerator + "/" + denominator;
    }
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    int great = 0;
    int less = 0;
    if(a<b) {
      great = b;
      less = a;
    }
    else {
      great = a;
      less = b;
    }
    while(great%less!=0) {
      int remainder = great%less;
      great = less;
      less = remainder;
    }
    return less;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int divis = gcd(numerator,denominator);
    numerator = numerator/divis;
    denominator = denominator/divis;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    numerator = getNumerator() * other.getNumerator();
    denominator = getDenominator() * other.getDenominator();
    reduce();
    return this;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    numerator = getNumerator() * other.getDenominator();
    denominator = getDenominator() * other.getNumerator();
    reduce();
    return this;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
