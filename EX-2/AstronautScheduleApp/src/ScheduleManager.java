import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance = null;
    private List<Task> tasks;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public boolean addTask(Task task) {
        for (Task t : tasks) {
            if (task.getStartTime().isBefore(t.getEndTime()) && t.getStartTime().isBefore(task.getEndTime())) {
                System.out.println("Error: Task conflicts with existing task \"" + t.getDescription() + "\".");
                return false;
            }
        }
        tasks.add(task);
        System.out.println("Task added successfully.");
        return true;
    }

    public boolean removeTask(String description) {
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                tasks.remove(t);
                System.out.println("Task removed successfully.");
                return true;
            }
        }
        System.out.println("Error: Task not found.");
        return false;
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        tasks.sort((t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()));
        for (Task t : tasks) {
            System.out.println(t);
        }
    }
}
