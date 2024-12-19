import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Car> carsList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static Race race = new Race();

    public static void main(String[] args) {
        carDataInput();
        System.out.println("Самая быстрая машина: " + race.getLeader(carsList));
    }

    public static void carDataInput() {
        System.out.println("Введите количество машин участвующих в гонке: ");
        int countOfCars = scanner.nextInt();
        for (int i = 1; i <= countOfCars; i++) {
            System.out.println("Введите название машины № " + i + ":");
            String name = scanner.next();
            int speed = inputSpeedAndCheck(i);
            carsList.add(new Car(name, speed));
        }
    }

    public static int inputSpeedAndCheck(int numberOfCar) { // принимает номер машины
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите скорость машины №:" + numberOfCar + ":");
            int speed = scanner.nextInt();
            if (speed < 0 || speed > 250) {
                System.out.println("Неправильное значение. Введите корректное значение скорости: ");
            } else {
                return speed;
            }
        }
    }
}