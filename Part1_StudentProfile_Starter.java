/*
 Part 1 (Starter) — Student Profile & Activity Summary
 Modules 1–3: Intro to Java, Variables/Data Types/Operators, Methods

 Goal:
 - Collect student profile data via console input (Scanner)
 - Compute term study hours
 - Estimate a simple GPA (cap at 4.0)
 - Print a formatted summary

 Teaching Cues (Liang-aligned):
 - Keep main() short; delegate to methods
 - Use correct data types (int vs double)
 - Practice formatted output with printf
*/

import java.util.Scanner;

public class Part1_StudentProfile_Starter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO 1: Prompt/read student name (String) and major (String).
        // Hint: use input.nextLine()

        System.out.print("Enter student name: ");
        String name = "";
        name = input.nextLine();

        // Prompt user for major.

        System.out.print("Enter major: ");
        String major = input.nextLine();

        // TODO 2: Prompt/read number of courses (int).
        // Hint: use input.nextInt()


        System.out.print("Enter number of courses: ");
        int numOfCourses;
        numOfCourses = input.nextInt();

        // TODO 3: Prompt/read weekly study hours (double).
        // Hint: use input.nextDouble()

        System.out.print("Enter weekly study hours: ");
        double weeklyHours;
        weeklyHours = input.nextDouble();

        // TODO 4: Prompt/read number of weeks in the term (int).

        System.out.print("Enter enter number of weeks in term: ");
        int weeks;
        weeks = input.nextInt();

        // TODO 5: Call calculateTermStudyHours(weeklyHours, weeks).

        double totalHours = calculateTermStudyHours(weeklyHours, weeks);

        // TODO 6: Call estimateGpa(totalHours, numCourses) (cap at 4.0).

        double gpa = estimateGpa(totalHours, numOfCourses);

        // TODO 7: Call printSummary(...) to display results.

        printSummary(name, major, numOfCourses, weeklyHours, totalHours, gpa);

        input.close();
    }

    // Formula: totalHours = weeklyHours * weeks
    public static double calculateTermStudyHours(double weeklyHours, int weeks) {
        // TODO

        double totalHours;
        totalHours = (int)(weeklyHours * weeks);

        return totalHours;
    }

    /*
     Provide a simple model (example):
       gpa = 2.0 + (totalHours / (numCourses * 20.0))
       cap at 4.0
     */
    public static double estimateGpa(double totalHours, int numOfCourses) {
        // TODO
        double gpa = 2.0 + (totalHours / (numOfCourses * 20.0));

        if (gpa > 4.0) {
            return 4.0;
        }

        return gpa;
    }

    // Print a clean labeled report.
    public static void printSummary(String name, String major, int numOfCourses,
                                    double weeklyHours, double totalHours, double gpa) {
        // TODO

        System.out.print("\n");
        System.out.println("REPORT");
        System.out.println("=======");
        System.out.println("Student name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Number of courses: " + numOfCourses);
        System.out.println("Weekly hours of study: " + weeklyHours);
        System.out.println("Total hours of study: " + totalHours);
        System.out.printf("GPA: %.2f", gpa);

    }
}
