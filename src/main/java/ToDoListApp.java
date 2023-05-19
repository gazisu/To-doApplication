import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        boolean exit = false;
        while (!exit) {
            System.out.println(".........To List Menu.........");
            System.out.println("1. Add Task");
            System.out.println("2. Mark a task as complete");
            System.out.println("3. View all task");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskname = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter due date: ");

                    Date duedate = new Date(scanner.nextLine());

                    Task task = new Task(taskname, description, duedate);
                    taskManager.addTask(task);
                    System.out.println("Task Added Successfully");
                    break;

                case 2:
                    System.out.println("Mark as complete task: ");
                    int taskIndex = scanner.nextInt();
                    taskManager.markTaskasComplete(taskIndex - 1);
                    break;
                case 3:
                    taskManager.viewAllTask();
                    break;
                case 4:
                    System.out.println("Delete task: ");
                    int deleteindex = scanner.nextInt();
                    taskManager.deletetask(deleteindex - 1);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Do you want to exit: ");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
            System.out.println();
        }
        scanner.close();
    }
}
