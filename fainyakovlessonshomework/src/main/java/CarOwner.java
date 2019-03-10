public class CarOwner {
    public static void main(String args[]){
        int distance;
        Car car = new Car();
        JamesBondCar bondCar = new JamesBondCar();
        car.start();
        distance = car.drive(30);
        System.out.println("Проехали метров: " + distance);
        distance = bondCar.drive(30);
        System.out.println("Тем временем нас обогнала машина Джеймса Бонда и проехала: " + distance + " метров! Хаха!");
        car.stop();
    }
}
