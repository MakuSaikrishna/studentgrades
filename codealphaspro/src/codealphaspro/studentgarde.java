package codealphaspro;

import java.util.Scanner;
import java.util.ArrayList;

public class studentgarde {
    public static void main(String[] args) {
        //**********************************************ArrayList***************************************************
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        //*************************************************//student grades//*************************************************
        System.out.println("Enter THe student grades (type -10 to finish):");
        while (true) {
            int grade = scanner.nextInt();
            if (grade == -10) {
                break;
            }
            grades.add(grade);
        }

        //************************// The average, highest, and lowest scores**********************************************************
        if (grades.isEmpty()) {
            System.out.println("No grades are entered.");
        } else {
            int total = 0;
            int highest = grades.get(0);
            int lowest = grades.get(0);
            
            for (int grade : grades) {
                total += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }
            double average = (double) total / grades.size();
            //*****************************************The results are *******************************************************
            System.out.println("Average Marks: " + average);
            System.out.println("Highest Marks: " + highest);
            System.out.println("Lowest Marks: " + lowest);
        }
        
        scanner.close();
    }
}