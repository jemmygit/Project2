package Project2;

public class T13Tester {
    public static void main(String[] args) {
        T13 test=new T13(13000,"white");
        T13 sedan = new Sedan(12500,"Grey",7.5);
        T13 Truck = new Truck(65000,"Red",1500);
        System.out.println("Price is "+test.calculateSalePrice());
        System.out.println("Price is "+sedan.calculateSalePrice());
        System.out.println("Price is "+Truck.calculateSalePrice());


    }
}
