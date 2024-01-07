public class Car {

 /*Create a Class Car that would have the following fields: carPrice and color
and method calculateSalePrice() which should be returning a price of the
car.
Create 2 subclasses: Sedan and Truck. The Truck class has a field as weight
and has its own implementation of calculateSalePrice() method in which
returned price is calculated as following: if weight>2000 then returned price
car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also has its own implementation
of calculateSalePrice(): if length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount*/

   double carPrice;
   String carColor;
  public Car(double carPrice, String carColor){
          this.carPrice=carPrice;
          this.carColor=carColor;
  }
  public Car(double carPrice){
          this.carPrice=carPrice;
  }
  public double calculateSalePrice(){
          return carPrice;
  }
}
class Sedan extends Car{
 double length;
       public Sedan(double carPrice,String carColor, double length) {
                super(carPrice, carColor);
                this.length=length;
        }
        @Override
        public double calculateSalePrice(){
               if(length>20){
                       return carPrice-((carPrice/100)*5);
               }else{
                     return carPrice-((carPrice/100)*10);
               }
        }
}
class Truck extends Car{
        double weight;
       public Truck(double carPrice, String carColor, double weight) {
                super(carPrice, carColor);
                this.weight=weight;
        }
        @Override
        public double calculateSalePrice(){
               if(weight>2000){
                       return carPrice-((carPrice/100)*10);
                       }else{
                       return carPrice-((carPrice/100)*20);
               }
        }

        public static void main(String[] args) {
                Sedan s=new Sedan(35000,"White",3);
                System.out.println("Sedan price is: "+s.calculateSalePrice());

                Truck t=new Truck(80000, "Red",2500);
                System.out.println("Truck price is: "+t.calculateSalePrice());

        }

}













