package methodoveriding24;

 class Test2 {
  public static void main(String[] args) {
   SBI s = new SBI();
   ICICI i = new ICICI();
   AXIX a = new AXIX();
   System.out.println("SBI Rate of Interest: "+s.getRateOfinterest());
   System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
   System.out.println("AXIX Rate of Interest: "+a.getRateOfInterest());
  }
}
