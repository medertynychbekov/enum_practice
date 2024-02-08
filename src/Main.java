import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scannerForStrings = new Scanner(System.in);

        Car car = new Car();

        try {
            System.out.println("write id for your car:");
            int id = scanner.nextInt();

            System.out.println("write model for your car:");
            String model = scannerForStrings.nextLine();

            System.out.println(Arrays.toString(Color.values()));
            System.out.println("write color for your car:");
            String color;

            try {
                color = scannerForStrings.nextLine();
                car.setId(id);
                car.setName(model);
                car.setColor(Color.valueOf(color));
            } catch (IllegalArgumentException e) {
                System.out.println("Выбери вариант из выше перечисленных");
            }

        } catch (InputMismatchException e) {
            System.out.println("Туура жазыныз");
        }

        System.out.println(car);
    }
}
