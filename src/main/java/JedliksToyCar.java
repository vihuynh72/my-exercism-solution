public class JedliksToyCar {
    private int meterDriven = 0;
    private int batteryPerc = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + meterDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryPerc == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + batteryPerc + "%";
        }
    }

    public void drive() {
        if (batteryPerc > 0) {
            meterDriven += 20;
            batteryPerc -= 1;
        }
    }
}