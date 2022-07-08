public final class OffRoadCar extends PassengerCar { // 3 класс иирархии
    private String suspensionType;
    private int maxSpeed;

    public OffRoadCar(String nameCar, int carYear, Engine engine, int mileage, Color color, String suspensionType, int maxSpeed) {
        super(nameCar, carYear, engine, mileage, color);
        this.suspensionType = suspensionType;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String infoCar() {
        return super.infoCar() +
                "\n Suspension Type " + suspensionType +
                "\n Max Speed " + maxSpeed;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
