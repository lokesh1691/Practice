package com.pratcice.coreJava8.InheriatnceProgram;

class Bike{
	  void run(){System.out.println("Hello Bike");}
	}
	class Splendor extends Bike{  
	  void run(){System.out.println("Hello Splendor");} 
	  	  public static void main(String args[]){  
	 //Splendor b =  new  Bike(); // error will get we need to cast into child object
        //Bike b = new Splendor(); //
		Splendor b = new Splendor();
	    b.run();  
	  }   	}