import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlSerializer {
    public void serializeToXml(OptionalCourse course, Lesson lesson, Student student, String filepath) {

        DataContainer dataContainer = new DataContainer();
        dataContainer.setLesson(lesson);
        dataContainer.setOptionalCourse(course);
        dataContainer.setStudent(student);

        try {
            XmlMapper mapper = new XmlMapper();
            mapper.writeValue(new File(filepath), dataContainer);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
