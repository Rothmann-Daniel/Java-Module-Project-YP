import java.util.ArrayList;
import java.util.InputMismatchException;
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
        int countOfCars = checkNumberAndNonNegative();
        for (int i = 1; i <= countOfCars; i++) {
            System.out.println("Введите название машины № " + i + ":");
            String name = scanner.next();
            int speed = inputSpeedAndCheck(i);
            carsList.add(new Car(name, speed));
        }
    }

    public static int inputSpeedAndCheck(int numberOfCar) {
        while (true) {
            System.out.println("Введите скорость машины № " + numberOfCar + ":");
            int speed = checkNumberAndNonNegative();
            if (speed > 250) {
                System.out.println("Неправильное значение. Введите корректное значение скорости: 0-250 ");
            } else {
                return speed;
            }
        }
    }

    public static int checkNumberAndNonNegative() {
        boolean validInput = false;
        int console = 0;
        while (!validInput) {
            try {
                console = scanner.nextInt();
                if (console < 0) {
                    System.out.println("Ошибка: введите положительное целое число.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите корректное целое число.");
                scanner.next();
            }
        }
        return console;
    }
}
