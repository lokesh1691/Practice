package com.pratcice.designpattern;

public class PenAdapter implements Pen {
    @Override
    public void write(String str) {
      System.out.println("I writing through PenAdapter");
    }
}
