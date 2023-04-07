package com;

public class Dinga {
    Dinga (int x){
    	System.out.println(1);
    }
    Dinga(){
    	this(10);
    	System.out.println(2);
    }
   public static void main (String[] args) {
	  
	   new Dinga();
   }
}
