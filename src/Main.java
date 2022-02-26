public class Main {
    public static void main(String[] args) {

        Car.build();
        Car.buy();
    }
    public class Car{
        public static void build(){
            System.out.println("i will build a car");

        }
        public static void buy(){
            System.out.println("I will buy this car");
        }
        int carSpeed = 0;
    }

}
