package Java.Observer;
//When you have a update and you have to show in many places you use observer pattern
import java.util.ArrayList;
import java.util.List;

public class Observer {
    static interface FitnessDataObserver{
        void update(FitnessData data);
    }
    static interface FitnessDataSubject{
        void registerObserver(FitnessDataObserver observer);
        void removeObserver(FitnessDataObserver observer);
        void notifyObservers();
    }
    static class FitnessData implements FitnessDataSubject{
        private int steps;
        private int activeMinutes;
        private int calories;
        private List<FitnessDataObserver> observers = new ArrayList<>();
        void push(FitnessDataObserver observer){
            observers.add(observer);
        }

        @Override
        public void registerObserver(FitnessDataObserver observer) {
            observers.add(observer);
        }

        @Override
        public void removeObserver(FitnessDataObserver observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers() {
            for (FitnessDataObserver o : observers) {
                o.update(this);
            }
        }
        public void newFitnessDataPushed(int steps, int activeMinutes, int calories) {
        this.steps = steps;
        this.activeMinutes = activeMinutes;
        this.calories = calories;

        System.out.println("\nFitnessData: New data received – Steps: " + steps +
            ", Active Minutes: " + activeMinutes + ", Calories: " + calories);

        notifyObservers();
    }

    public void dailyReset() {
        this.steps = 0;
        this.activeMinutes = 0;
        this.calories = 0;

        System.out.println("\nFitnessData: Daily reset performed.");
        notifyObservers();
    }

    // Getters
    public int getSteps() { return steps; }
    public int getActiveMinutes() { return activeMinutes; }
    public int getCalories() { return calories; }
    }
    static class LiveActivityDisplay implements FitnessDataObserver{
        @Override
        public void update(FitnessData data){
            System.out.println("Live Display-> Steps:"+data.getSteps()+", Active Minutes:"+data.getActiveMinutes()+", Calories:"+data.getCalories());
        }
    }
    public class FitnessObserverDemo{
        public static void main(String[] args) {
            FitnessData fitnessData = new FitnessData();
            LiveActivityDisplay liveDisplay = new LiveActivityDisplay();

            fitnessData.registerObserver(liveDisplay);

            fitnessData.newFitnessDataPushed(5000, 30, 200);
            fitnessData.newFitnessDataPushed(8000, 45, 350);

            fitnessData.dailyReset();
        }
    }
}
