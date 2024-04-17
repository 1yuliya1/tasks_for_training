import java.util.Scanner;

public class Task_3_BaseConverter {
        public static void main(String[] args) {
            double result;
            String obozn;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите температуру в цельсиях:");
            double celsius = scanner.nextDouble();

            System.out.println("во что конвертировать:" + "\n" + "1. Кельвины" + "\n" + "2. Фаренгейты");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    result = convertToKelvin(celsius);
                    obozn = "К";
                    break;
                case 2:
                    result = convertToFahrenheit(celsius);
                    obozn = "F";
                    break;
                default:
                    System.out.println("Не правильный выбор.");
                    return;
            }
            System.out.printf(celsius +" градусов Цельсия равно " + result + " " + obozn);
        }

        public static double convertToKelvin(double celsius) {
            return celsius + 273.15;
        }
        public static double convertToFahrenheit(double celsius) {
            return celsius * 1.8 + 32;
        }
    }
