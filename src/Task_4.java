import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {

        final double DEGREES_IN_ONE_HOUR = 360 / 12;
        final double DEGREES_IN_ONE_MINUTE = 360 / 60;
        final double DEGREES_IN_ONE_MINUTE_IN_HOUR = DEGREES_IN_ONE_HOUR / 60;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите часы");
        double hours = scanner.nextDouble();
        System.out.println("Введите минуты");
        double minutes = scanner.nextInt();

        //За формулу не ручаюсь :)
        double hoursAngle = hours * DEGREES_IN_ONE_HOUR + minutes * DEGREES_IN_ONE_MINUTE_IN_HOUR;

        double minutesAngle = minutes * DEGREES_IN_ONE_MINUTE;
        double angle = Math.abs(hoursAngle - minutesAngle);

        System.out.println("Angle: " + angle);

    }
    }