import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor @Getter @Setter
public class Course {
    private String name;
    private int capacity;
    private List<Student> studentsList;
}
