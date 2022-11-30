import java.time.DateTimeException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        TaskController datebook = new TaskController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                label:
                while (true) {
                    printMenu();
                    System.out.print("Выберите пункт меню: ");
                    int menu = Integer.parseInt(scanner.nextLine());
                    switch (menu) {
                        case 1:
                            datebook.inputTask(scanner);
                            break;
                        case 2:
                            datebook.deleteTask(scanner);
                            break;
                        case 3:
                            datebook.getTasksForDay(scanner);
                            break;
                        case 4:
                            datebook.printRemovedTasks();
                            break;
                        case 5:
                            datebook.changeName(scanner);
                            break;
                        case 6:
                            datebook.changeDescription(scanner);
                            break;
                        case 0:
                            break label;
                    }
                }
            } catch (DateTimeException dte) {
                System.out.println("Введите дату и время в правильном формате чч:мм гггг-мм-дд");
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printMenu() {
        System.out.println(
                "1. Добавить задачу\n" + "2. Удалить задачу\n" + "3. Получить задачу на указанный день\n" +
                        "4. Получить список удаленных задач\n" + "5. Редактировать заголовок\n" +
                        "6. Редактировать описание\n" + "0. Выход ");
    }
}
