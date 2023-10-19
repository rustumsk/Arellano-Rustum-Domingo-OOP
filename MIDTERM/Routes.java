public class Routes{
   private final int speed;
   private final int start = 0;
   private final double minglanillia = 14.2;
   private final double sanFernando = 12.7;
   private final double carcar = 11.4;
   
   public Routes(int speed){
      this.speed = speed;
   }
   public double convertTotal(double distance, double speed){
      return distance / speed * 60;
   }

   public void defaultRoute(){
      System.out.println("* Cebu City (SouthBus) - Start ~ " + start);
      System.out.println("* Minglanilla (Route 1) ~ " + minglanillia + "kn");
      System.out.println("* San Fernando - (Route 2) ~ " + sanFernando + "km");
      System.out.println("* CarCar - (Route 3) ~ " + carcar + "km");
   }
   public void routeBarili(){
      double barili = 16.4;
      double dumanjug = 23;
      double alcantara = 5;
      
      defaultRoute();
      System.out.println("* Barili - (Route 4.1) ~ " + barili + "km");
      System.out.println("* Dumanjug - (Route 4.1.1) ~ " + dumanjug + "km"); 
      System.out.println("* Alcantara - (Route 4.1.2) ~ " + alcantara + "km"); 
   
      double moalboal = start + minglanillia + sanFernando + carcar + barili + dumanjug + alcantara+ 2.6;
      System.out.println("* Moalboal - (End) ~ 2.6km");
   
      System.out.println("Speed: " + this.speed + " km/hr");
      System.out.printf("Total Distance: %.1fkm" + "\n",moalboal);
      
      double total = convertTotal(moalboal,this.speed);
      int bHour = (int)total / 60;
      int bMinute = (int)total % 60;
      System.out.printf("Estimated Time Arrival: ~" + bHour + " Hour/s " + bMinute + " Minute/s");
   }
   
   public void routeDumanjug(){
      double sibonga = 11.5;
      double dumanjug = 32.7;
      double alcantara = 16.7;
      
      defaultRoute();
      System.out.println("* Sibonga - (Route 4.2) ~ " + sibonga + "km");
      System.out.println("* Dumanjug - (Route 4.1.1) ~ " + dumanjug + "km"); 
      System.out.println("* Alcantara -(Route 4.2.2) ~ " + alcantara + "kn");
   
      double moalboal = start + minglanillia + sanFernando + carcar + sibonga + dumanjug + alcantara + 2.4;
      System.out.println("* Moalboal - (End) ~ 2.4km");
        
      System.out.println("Speed: " + this.speed + " km/hr");
      System.out.printf("Total Distance: %.1fkm" + "\n",moalboal);
   
      double total = convertTotal(moalboal,this.speed);
      int dHour = (int)total / 60;
      int dMinute = (int)total % 60;
      System.out.printf("Estimated Time Arrival: ~" + dHour + " Hour/s " + dMinute + " Minute/s");
   }
   
   public void routeArgao(){
      double sibonga = 11.5;
      double argao = 26.5;
      double ronda = 21;
      double alcantara = 10.8;
      
      defaultRoute();
      System.out.println("* Sibonga - (Route 4.2) ~ " + sibonga + "km");
      System.out.println("* Argao - (Route 5) ~ " + argao + "km"); 
      System.out.println("* Ronda - (Route 5.1) ~ " + alcantara + "km"); 
      System.out.println("* Alcantara - (Route 4.2.1) ~ " + alcantara + "km"); 
   
      double moalboal = start + minglanillia + sanFernando + carcar + sibonga + argao + ronda + alcantara +  2.4;
      System.out.println("* Moalboal - (End) ~ 2.4km");
   
      System.out.println("Speed: " + this.speed + " km/hr");
      System.out.printf("Total Distance: %.1fkm" + "\n",moalboal);
   
      double total = convertTotal(moalboal,this.speed);
      int aHour = (int)total / 60;
      int aMinute = (int)total % 60;
      System.out.printf("Estimated Time Arrival: ~" + aHour + " Hour/s " + aMinute + " Minute/s");   
   }
   
}