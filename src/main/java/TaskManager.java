import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void markTaskasComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setCompleted(true);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void viewAllTask() {
        if (tasks.isEmpty()) {
            System.out.println("No task found");

        } else {
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println("Task " + (i + 1) + ";");
                System.out.println("Name: " + task.getTaskname());
                System.out.println("Descprition: " + task.getDescription());
                System.out.println("Due Date: " + task.getduedate());
                System.out.println("Status: " + task.getCompleted());
                System.out.println();
            }
        }
    }

    public void deletetask(int index) {
        if (index > 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task Deleted Successfully.");
        } else {
            System.out.println("Invalid task index");
        }

    }
}
