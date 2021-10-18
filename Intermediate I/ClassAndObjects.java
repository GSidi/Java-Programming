package JavaEx.OOP;

public class ClassAndObjects {

    static class Lamp{

        boolean isOn;

        void turnOn(){
            isOn = true;
            System.out.println("Light is on?"+ isOn);
        }

        void turnOff(){
            isOn = false;
            System.out.println("Light is on?"+ isOn);
        }
    }


    public static void main(String[] args) {

        Lamp led = new Lamp();
        Lamp led2 = new Lamp();

        led.turnOn();
        led2.turnOff();
    }

}
