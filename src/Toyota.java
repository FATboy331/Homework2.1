public class Toyota {    // 1 класс иирархии
    private String nameCar;
    private int carYear;
    private Engine engine;

    public Toyota(String nameCar, int carYear, Engine engine) {
        this.nameCar = nameCar;
        this.carYear = carYear;
        this.engine = engine;
    }

    public String getNameCar() {
        return nameCar;
    }

    public int getCarYear() {
        return carYear;
    }

    public Engine getEngine() {
        return engine;
    }
}
