public class Car {
    private String brand;
    private String name;
    private String color;
    private int engineVolume;
    private Car[] cars;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setMassive(Car[] massive) {
        this.cars = massive;
    }

    public Car[] getMassive() {
        return cars;
    }
}
