package extramile;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingStudentGrades {

    public List<StudentGrade> readingfile(String file) {
        List<StudentGrade> studentGrades = new ArrayList<>();

        try (Scanner reader = new Scanner(new FileReader("files/" + file))) {

            while (reader.hasNextLine()) {
                studentGrades.add(fetchingStudentGrade(reader.nextLine()));
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return studentGrades;
    }

    private StudentGrade fetchingStudentGrade(String line) {
        String[] tokens = line.split("\\|");

        return new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
    }
}
