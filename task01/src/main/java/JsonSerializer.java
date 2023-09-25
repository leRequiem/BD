import com.google.gson.Gson;

import java.io.*;

public class JsonSerializer {
    public void serializeToJson(Course course, Lesson lesson, Student student, String filepath) {
        Gson gson = new Gson();
        DataContainer dataContainer = new DataContainer();
        dataContainer.setLesson(lesson);
        dataContainer.setOptionalCourse(course);
        dataContainer.setStudent(student);

        String json = gson.toJson(dataContainer);

            try (FileWriter writer = new FileWriter(filepath)) {
                writer.write(json);
            } catch (IOException e) {
                throw new IllegalArgumentException(e);
        }
   }
}
