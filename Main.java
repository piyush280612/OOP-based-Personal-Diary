package personalDiaryOOP;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diary myDiary = new Diary();
        boolean running = true;

        System.out.println("📓 Welcome to Your Personal Diary 📓");

        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Entry");
            System.out.println("2. View All Entries");
            System.out.println("3. View Entry by Title");
            System.out.println("4. Delete Entry");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline

            switch (choice) {
                case 1: // Add Entry
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Content: ");
                    String content = scanner.nextLine();

                    System.out.print("Mood (Happy, Sad, Excited, etc): ");
                    String mood = scanner.nextLine();

                    Entry newEntry = new Entry(title, content, mood, LocalDateTime.now());
                    myDiary.addEntry(newEntry);
                    System.out.println("✅ Entry added!");
                    break;

                case 2: // View all
                    List<Entry> allEntries = myDiary.getAllEntries();
                    if (allEntries.isEmpty()) {
                        System.out.println("No entries found.");
                    } else {
                        for (Entry e : allEntries) {
                            System.out.println("----------------------");
                            System.out.println(e);
                        }
                    }
                    break;

                case 3: // View by title
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    Entry found = myDiary.getEntryByTitle(searchTitle);
                    if (found != null) {
                        System.out.println("\n--- Entry Found ---");
                        System.out.println(found);
                    } else {
                        System.out.println("❌ No entry with that title.");
                    }
                    break;

                case 4: // Delete
                    System.out.print("Enter title to delete: ");
                    String deleteTitle = scanner.nextLine();
                    boolean deleted = myDiary.deleteEntry(deleteTitle);
                    if (deleted) {
                        System.out.println("✅ Entry deleted.");
                    } else {
                        System.out.println("❌ Entry not found.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("👋 Exiting Diary. Have a great day!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}

