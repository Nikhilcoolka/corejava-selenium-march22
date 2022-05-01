package org.matrix.sigma.kadambari.practice;

 class TestBank {
     public static void main(String[] args) {
         Bank b;
         b=new SBI();
         System.out.println("Rate of intrest is:"+b.getRateOfInterest());
         b=new PNB();
         System.out.println("Rate of intrest is:"+b.getRateOfInterest());

     }
}
