import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor @Getter @Setter @AllArgsConstructor
public class Student implements Serializable {
    private String name;
    private int age;
    private OptionalCourse chosenCourse;
}
