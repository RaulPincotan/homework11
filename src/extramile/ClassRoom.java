package extramile;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private final List<StudentGrade> grades;

    public ClassRoom(List<StudentGrade> grades) {
        this.grades = grades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {
                result.add(studentGrade.getGrade());
            }
        }
        return result;
    }

    public List<StudentGrade> getGrades() {
        return grades;
    }

    public StudentGrade getGradeForStudent(String student) {
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getName().equalsIgnoreCase(student)) {
                return studentGrade;
            }
        }
        return null;
    }

    public StudentGrade getMaxGrades(String discipline) {
        int max = findMaxGrade(discipline);
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getGrade() == max && studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {
                return studentGrade;
            }
        }
        return null;
    }

    private int findMaxGrade(String discipline) {
        int max = Integer.MIN_VALUE;
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {

                if (studentGrade.getGrade() > max) {
                    max = studentGrade.getGrade();

                }
            }
        }
        return max;
    }


    public StudentGrade getMaxGrade() {
        int max = findMaxGrade();

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getGrade() == max) {
                return studentGrade;
            }
        }
        return null;
    }

    private int findMaxGrade() {
        int max = Integer.MIN_VALUE;

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getGrade() > max) {
                max = studentGrade.getGrade();
            }
        }
        return max;
    }


    public int getAverage(String discipline) {
        int count = 0;
        int total = 0;

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {
                count++;
                total += studentGrade.getGrade();
            }
        }
        return total / count;
    }

    public StudentGrade getWorstGrade(String discipline) {
        int min = getMinGrade(discipline);

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getGrade() == min && studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {
                return studentGrade;
            }
        }
        return null;
    }

    private int getMinGrade(String discipline) {
        int min = Integer.MAX_VALUE;

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {
                if (studentGrade.getGrade() < min) {
                    min = studentGrade.getGrade();
                }
            }
        }
        return min;
    }
}
