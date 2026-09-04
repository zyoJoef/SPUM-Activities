package com.mycompany.examresult;

import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExamResultDAO dao = new ExamResultDAO();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("\n==== Exam Results CRUD ====");
                System.out.println("1. Add Result");
                System.out.println("2. View All Results");
                System.out.println("3. Update Result");
                System.out.println("4. Delete Result");
                System.out.println("5. Exit");
                System.out.print("Choose option: ");
                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1 -> {
                        System.out.print("Student Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Subject: ");
                        String subject = scanner.nextLine();
                        System.out.print("Score: ");
                        String score = scanner.nextLine();
                        Timestamp now = new Timestamp(System.currentTimeMillis());
                        ExamResult newResult = new ExamResult(name, subject, score, now);
                        dao.insertResult(newResult);
                        System.out.println(" Result added.");
                    }
                    case 2 -> {
                        List<ExamResult> results = dao.getAllResults();
                        System.out.println("\n=== All Exam Results ===");
                        for (ExamResult r : results) {
                            System.out.printf("ID: %d | Name: %s | Subject: %s | Score: %s | Date: %s\n",
                                    r.getId(), r.getStudentName(), r.getSubject(), r.getScore(), r.getDateTaken());
                        }
                    }
                    case 3 -> {
                        System.out.print("Enter ID to update: ");
                        int updateId = Integer.parseInt(scanner.nextLine());
                        System.out.print("New Student Name: ");
                        String upName = scanner.nextLine();
                        System.out.print("New Subject: ");
                        String upSubject = scanner.nextLine();
                        System.out.print("New Score: ");
                        String upScore = scanner.nextLine();
                        Timestamp upDate = new Timestamp(System.currentTimeMillis());
                        ExamResult updated = new ExamResult(updateId, upName, upSubject, upScore, upDate);
                        dao.updateResult(updated);
                        System.out.println("Result updated.");
                    }
                    case 4 -> {
                        System.out.print("Enter ID to delete: ");
                        int deleteId = Integer.parseInt(scanner.nextLine());
                        dao.deleteResult(deleteId);
                        System.out.println("Result deleted.");
                    }
                    case 5 -> {
                        System.out.println("Goodbye!");
                        running = false;
                    }
                    default -> System.out.println("Invalid option.");
                }
            }
        }
    }
}
