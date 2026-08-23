public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    };

    public int remainingMinutesInOven(int TimeElapsed) {
        return expectedMinutesInOven() - TimeElapsed;
    }

    public int preparationTimeInMinutes(int numLayer) {
        return numLayer * 2;
    };

    public int totalTimeInMinutes(int numLayer, int CookingTime) {
        return CookingTime + preparationTimeInMinutes(numLayer);
    }
}
