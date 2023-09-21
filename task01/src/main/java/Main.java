import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonSerializer serializer1 = new JsonSerializer();
        XmlSerializer serializer2 = new XmlSerializer();
        String jsonFilepath = "C:/Users/kamil/IdeaProjects/Course2/task01/toJson.json";
        String xmlFilepath = "C:/Users/kamil/IdeaProjects/Course2/task01/toXml.xml";

        // заполняем OptionalCourse
        OptionalCourse course1 = new OptionalCourse();
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

        serializer1.serializeToJson(course1, lesson, student, jsonFilepath);
        serializer2.serializeToXml(course1, lesson, student, xmlFilepath);
    }
}
