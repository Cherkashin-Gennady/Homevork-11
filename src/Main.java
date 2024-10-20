import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Задача 1");
        printLeapYear(2025);
    }

    public static void printLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является высокостным");
        } else {
            System.out.println(year + " год не является высокостным");
        }

        // Task 2
        System.out.println("Задача 2");
        printRecommendedAppVersion(1, 2015);
    }

    public static void printRecommendedAppVersion(int deviceTupe, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear) {
            if (deviceTupe == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (deviceTupe == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        // Task 3
        System.out.println("Задача 3");
        int deys = calculateDeliveryDey(96);
        printDeliveryDey(deys);
    }

    public static int calculateDeliveryDey(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance >= 20 && distance < 60) {
            return 2;
        } else if (distance >= 60 && distance < 100) {
            return 3;
        }
        return -1;
    }

    public static void printDeliveryDey(int deys) {
        if (deys >= 0) {
            System.out.println("Доставка займет " + deys + " дня");
        } else {
            System.out.println("Доставки нет.");
        }
    }
}
