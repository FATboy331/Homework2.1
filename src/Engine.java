public class Engine {
    private double volume;

    private String name;

    public Engine(double volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
