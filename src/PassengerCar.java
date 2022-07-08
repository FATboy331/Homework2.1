public class PassengerCar extends Toyota{  // 2 класс иирархии
    private int mileage;
    private Color color;

   public  String infoCar (){
       return "Name Car " + getNameCar() +
               "\n Car Year " + getCarYear() +
               "\n Engine " + getEngine().getName() + " " + getEngine().getVolume() +
               "\n mileage " + mileage +
               "\n Color " + color;
   }
public final String infoCar (String speed) {
    return "Name Car " + getNameCar() +
            "\n Car Year " + getCarYear() +
            "\n Engine " + getEngine().getName() + " " + getEngine().getVolume() +
            "\n mileage " + mileage +
            "\n Color " + color +
            "\n Speed " + speed;
}

    public PassengerCar(String nameCar, int carYear, Engine engine, int mileage, Color color) {
        super(nameCar, carYear, engine);
        this.mileage = mileage;
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public Color getColor() {
        return color;
    }
}
