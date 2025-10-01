import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final DateTimeFormatter formatter = 
        DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScheduleManager manager = ScheduleManager.getInstance();

        boolean running = true;
        while (running) {
            System.out.println("\n--- Astronaut Daily Schedule ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Description: ");
                    String desc = sc.nextLine();

                    try {
                        System.out.print("Enter Start Time (hh:mm AM/PM): ");
                        String startInput = sc.nextLine().toUpperCase().trim();
                        LocalTime start = LocalTime.parse(startInput, formatter);

                        System.out.print("Enter End Time (hh:mm AM/PM): ");
                        String endInput = sc.nextLine().toUpperCase().trim();
                        LocalTime end = LocalTime.parse(endInput, formatter);

                        if (end.isBefore(start) || end.equals(start)) {
                            System.out.println("Error: End time must be after start time.");
                            break;
                        }

                        System.out.print("Enter Priority (High/Medium/Low): ");
                        String priority = sc.nextLine();

                        Task task = TaskFactory.createTask(desc, start, end, priority);
                        manager.addTask(task);

                    } catch (DateTimeParseException e) {
                        System.out.println("Error: Invalid time format. Use hh:mm AM/PM (e.g., 09:00 AM).");
                    }
                    break;

                case "2":
                    System.out.print("Enter Task Description to Remove: ");
                    String removeDesc = sc.nextLine();
                    manager.removeTask(removeDesc);
                    break;

                case "3":
                    manager.viewTasks();
                    break;

                case "4":
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
