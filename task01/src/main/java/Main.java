import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonSerializer serializer1 = new JsonSerializer();
        XmlSerializer serializer2 = new XmlSerializer();
        String jsonFilepath = "C:/Users/Emile/IdeaProjects/BD/task01/toJson.json";
        String xmlFilepath = "C:/Users/Emile/IdeaProjects/BD/task01/toXml.xml";

        // заполняем Course
        Course course1 = new Course();
        course1.setName("Java Backend");
        course1.setCapacity(30);

        // заполняем Student
        Student student = new Student();
        student.setName("Volodya");
        student.setAge(19);
        student.setChosenCourse(course1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);

        // заполняем Lesson
        Lesson lesson = new Lesson();
        lesson.setTopic("Generics");
        lesson.setCountOfLessons(2);
        lesson.setStudentsList(studentList);
        lesson.setCourseName(course1.getName());

        serializer1.serializeToJson(course1, lesson, student, jsonFilepath);
        serializer2.serializeToXml(course1, lesson, student, xmlFilepath);
    }
}
