package com.pratcice.designpattern;

import com.pratcice.designTest.PioletPen;

public class School {
  public static void main(String[] args) {
    Pen p= new PenAdapter();
    Assignment ass= new Assignment();
    ass.setP(p);
    ass.writeAss("Pilot pen");

    }
}
