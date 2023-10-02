import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonSerializer serializer1 = new JsonSerializer();
        XmlSerializer serializer2 = new XmlSerializer();
        String jsonFilepath = "C:/Users/Emile/IdeaProjects/BD/task01/toJson.json";
        String xmlFilepath = "C:/Users/Emile/IdeaProjects/BD/task01/toXml.xml";
        List<Student> studentList = new ArrayList<>();

        // заполняем Course
        Course course1 = new Course();
        course1.setName("Java Backend");
        course1.setCapacity(30);
        course1.setStudentsList(studentList);

        // заполняем Student
        Student student = new Student();
        student.setName("Volodya");
        student.setAge(19);
        student.setChosenCourse(course1);
        studentList.add(student);

        // заполняем Lesson
        Lesson lesson = new Lesson();
        lesson.setCourse(course1);
        lesson.setTopic("Generics");
        lesson.setCountOfLessons(2);

        serializer1.serializeToJson(course1, lesson, student, jsonFilepath);
        serializer2.serializeToXml(course1, lesson, student, xmlFilepath);
    }
}
