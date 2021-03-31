package com.pratcice.designpattern;

public class Assignment {

   private Pen p;
   public Pen getP() {
    return p;
    }

  public void setP(Pen p) {
    this.p = p;
    }

  public void writeAss(String arr){
      p.write(arr);
  }
}
