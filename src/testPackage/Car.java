package testPackage;

 class Car {
   static int numberOfDoor =4;
    static String manufacturer = "BMW";
    static String model = "G89 M3";
    static int year = 2022;
    static boolean isAllWheelDrive =false;
    public static void main(String[] args){

        System.out.println("This is a " + year + " "+ manufacturer + " "+ model);
        System.out.println("It has " + manufacturer + " doors");
        System.out.println("Is is AWD " + isAllWheelDrive);

    }
    void shutOff() {
        System.out.println("Car is turing off");
    }
    void accelerate (){
        System.out.println("Car is accelerating");
    }
    void decelerate() {
        System.out.println("Car is braking");
    }
}
