import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor @Getter @Setter
public class Lesson {
    private Course course;
    private String topic;
    private int countOfLessons;
}
