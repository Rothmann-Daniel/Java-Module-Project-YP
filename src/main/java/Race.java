import java.util.ArrayList;

public class Race {
    String leaderName = "";
    int leaderDistance = 0;

    public String getLeader(ArrayList<Car> carsList) {
        for (Car car : carsList) {
            int carDistance = getDistance(car.getSpeed());
            if (carDistance > leaderDistance) {
                leaderDistance = carDistance;
                leaderName = car.getName();
            }
        }
        return leaderName;
    }

    private int getDistance(int speed) {
        int hours = 24;
        return speed * hours;
    }
}