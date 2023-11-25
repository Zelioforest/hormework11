// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        defineALeapYear(2024);
        defineTypeOS(1, 2017);
        int numbersOfDays = calculateTheNumbersOfDays (75);
        if ( numbersOfDays != 0) {
            System.out.println("Потребуется дней: " + numbersOfDays);
        } else {
            System.out.println("Нет доставки");
        }
    }

    public static void defineALeapYear(int year) {
        // tack 1
        if (year > 1584) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
    }

    public static void defineTypeOS(int clientOS, int clientDeviceYear) {
        //  (0 — iOS, 1 — Android)
        int currentYear = 2023;
        if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

    }

    public static int calculateTheNumbersOfDays (int deliveryDistance) {
        int timeDelivery = 1;
        if (deliveryDistance < 100) {
            if (deliveryDistance >= 60) {
                return timeDelivery = timeDelivery + 2;
            } else if (20 <= deliveryDistance && deliveryDistance < 60) {
                return timeDelivery = timeDelivery + 1;
            } else {
                return timeDelivery;
            }
        } else {
            return 0;
        }
    }

}