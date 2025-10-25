
// Client / Demo class
public class Client {
    public static void main(String[] args) {
        FitnessData fitnessData = new FitnessData();
        LiveActivityDisplay liveDisplay = new LiveActivityDisplay();

        fitnessData.registerObserver(liveDisplay);

        fitnessData.newFitnessDataPushed(5000, 30, 200);
        fitnessData.newFitnessDataPushed(8000, 45, 350);

        fitnessData.dailyReset();
    }
}
