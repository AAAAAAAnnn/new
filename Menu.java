import java.util.Scanner;

public class Menu {
    public void run() {

        Boolean isWork = true;
        while (isWork) {

        }

        displayMenu();

    }

    private void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            switch (userInput) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Такой команды нет");
            }
            printMenu();
            userInput = scanner.nextInt();
        }

    }

    private static void printMenu() {
        System.out.println("Выберете вариант заполнения массива");
        System.out.println("1. Заполнить БД");
        System.out.println("2. Выбрать элемент");
        System.out.println("3. Выйти из приложения");
    }
}


