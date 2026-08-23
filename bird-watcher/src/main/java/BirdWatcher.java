
class BirdWatcher {
    private final int[] birdsPerDay;
    private int todayDate = 6;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[todayDate];
    }

    public void incrementTodaysCount() {
        birdsPerDay[todayDate]++ ;
    }

    public boolean hasDayWithoutBirds() {
        for (int todayBird : birdsPerDay) {
            if (todayBird == 0) {return true;}
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalBirdCount = 0;
        for (int i = 0; i < numberOfDays; i++) {
            if (i == 7) {break;}
            totalBirdCount += birdsPerDay[i];
        }
        return totalBirdCount;
    }

    public int getBusyDays() {
        int numBusyDays = 0;
        for (int todayBird : birdsPerDay) {
            if (todayBird >= 5) {numBusyDays++;}
        }
        return numBusyDays;
    }
}
