class NeedForSpeed {
    private static final int SPEED_NITRO = 50;
    private static final int BATTERY_DRAIN_NITRO = 4;
    private final int speed;
    private final int batteryDrain;

    private int battery;

    private static final int BATTERY_POWER = 100;

    private int distance;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distance = 0;
        this.battery = BATTERY_POWER;
    }

    public boolean batteryDrained() {
        return battery == 0;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (this.battery >= this.batteryDrain) {
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(SPEED_NITRO, BATTERY_DRAIN_NITRO);
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getBattery() {
        return battery;
    }
}

class RaceTrack {

    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        return car.getSpeed() * car.getBattery() / car.getBatteryDrain() >= this.distance;
    }
}
