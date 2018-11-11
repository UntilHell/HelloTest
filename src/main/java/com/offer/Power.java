package com.offer;

import org.junit.Test;

public class Power {

    boolean invalidInput = false;
    public double power(double base, int exponent) {

//      if (equal(base,0.0) && exponent < 0){
//          invalidInput = true;
//          return 0.0;
//      }
      int absexponent = exponent;
      if(exponent < 0) {
          absexponent = - exponent;
      }
      double result = getPower(base,absexponent);
      if(exponent < 0){
          result = 1.0 / result;
      }
      return result;


    }

    public double getPower(double base, int exponent){
        double result = 1.0;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return  result;
    }
//
//    public double getPower(double base,int exponent){
//        if(exponent == 0){
//            return 1;
//        }
//        if(exponent == 1){
//            return base;
//        }
//
//        double result = getPower(base,exponent>>1);
    //result *= result;
//        if(exponent & 0x1 == 1){
//
//        }

    public boolean equal(double num1,double num2){
        if(num1 - num2 < 0.000001 && num1 - num2 > -0.000001){
            return true;
        }else{
            return false;
        }
    }

    @Test
    public void testPower(){
        System.out.println(power(0.0000000001,-2));
    }

}
