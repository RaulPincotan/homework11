package extramile;

public class MainStudentGrades {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(new ReadingStudentGrades().readingfile("grades.txt"));
        System.out.println(classRoom.getGrades());
        System.out.println();
        System.out.println(classRoom.getGradesForDiscipline("Computer Science"));
        System.out.println(classRoom.getGradeForStudent("Duilio Marius"));
        System.out.println(classRoom.getMaxGrades("Physics"));
        System.out.println(classRoom.getMaxGrade());
        System.out.println();
        System.out.println(classRoom.getAverage("Physics"));
        System.out.println(classRoom.getWorstGrade("Physics"));


    }
}
