public class ElonsToyCar {
    private int battery;
    private int distance;

    private static final int DISTANCE_STEP = 20;
    private static final int BATTERY_POWER = 100;

    public ElonsToyCar() {
        this.battery = BATTERY_POWER;
        this.distance= 0;
    }
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distance);
    }

    public String batteryDisplay() {
        if (this.battery > 0) {
            return String.format("Battery at %d%%", this.battery);
        } else {
            return "Battery empty";
        }
    }

    public void drive() {
        if (this.battery > 0) {
            this.battery--;
            this.distance += DISTANCE_STEP;
        }
    }
}
