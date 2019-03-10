public class Car {

    int distance = 0;

    //начало движения
    public void start(){
        System.out.println("Начинаю движение");
    }

    //остановка
    public void stop(){
        System.out.println("Останавливаюсь");
    }

    //сколько проехать
    public int drive(int howlong){
        distance = howlong*60;
        return distance;
    }
}
