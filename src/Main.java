public class Main {
    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar
                ("Camry 30", 2003, new Engine(2.4, "2AZ-FE"), 10000, Color.PURPLE);
        System.out.println(passengerCar.infoCar("400"));

        OffRoadCar offRoadCar = new OffRoadCar
                ("RX - 300", 2000, new Engine(3.0, "1MZ - FE"), 12000, Color.BLACK,
                        "4WD", 290);
        System.out.println(offRoadCar.infoCar());

        OffRoadCar offRoadCar1 = new OffRoadCar
                ("PRADO 120 ", 2005, new Engine(4.0, "1GR - FE"), 80000, Color.SILVER,
                        "4WD", 320);
        System.out.println(offRoadCar1.infoCar());
    }
}