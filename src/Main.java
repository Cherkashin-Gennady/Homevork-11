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
        printRecommendedAppVersion(1, 2024);
        //метод, на входе два параметра: тип операционной системы (0 — iOS, 1 — Android )
        // и год выпуска устройства
    }

    public static void printRecommendedAppVersion(int deviceTupe, int deviceYear) {
        int currentYear = LocalDate.now().getYear(); //Текущий год
        if (deviceYear < currentYear) { //система старше текущего года
            if (deviceTupe == 0) {  //тип системы ios
                System.out.println("Установите облегченную версию приложения для iOS."); //вывод в консоль
            } else {  //иначе - тип системы Android
                System.out.println("Установите облегченную версию приложения для Android."); //вывод в консоль
            }
        } else { //иначе - система текущего года
            if (deviceTupe == 0) { //тип системы ios
                System.out.println("Установите версию приложения для iOS."); //вывод в консоль -загрузи актуальную версию IOS
            } else { //иначе - тип системы Android
                System.out.println("Установите версию приложения для Android."); //вывод в консоль -загрузи актуальную версию Android
            }
        }
        // Task 3
        System.out.println("Задача 3");
        int deys = calculateDeliveryDey(8);
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
            System.out.println("Срок доставки " + deys + " дн.");
        } else {
            System.out.println("Доставки нет.");
        }
    }
}
