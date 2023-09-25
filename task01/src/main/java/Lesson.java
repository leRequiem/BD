import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor @Getter @Setter
public class Lesson {
    private String courseName;
    private String topic;
    private List<Student> studentsList;
    private int countOfLessons;
}
