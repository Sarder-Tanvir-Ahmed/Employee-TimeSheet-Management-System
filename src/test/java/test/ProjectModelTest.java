package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Project;

class ProjectModelTest {

    @Test
    void testGettersAndSetters() {
        Project project = new Project("1", "Project X", "John Doe", "2022-01-01", "2022-12-31");

        project.setProject_id("2");
        Assertions.assertEquals("2", project.getProject_id());

        project.setProject_name("Project Y");
        Assertions.assertEquals("Project Y", project.getProject_name());

        project.setProject_Under_Who("Jane Doe");
        Assertions.assertEquals("Jane Doe", project.getProject_Under_Who());

        project.setStart_date("2023-01-01");
        Assertions.assertEquals("2023-01-01", project.getStart_date());

        project.setEnd_date("2023-12-31");
        Assertions.assertEquals("2023-12-31", project.getEnd_date());
    }

    @Test
    void testConstructors() {
        Project project1 = new Project("1", "Project X", "John Doe", "2022-01-01", "2022-12-31");
        Assertions.assertEquals("1", project1.getProject_id());
        Assertions.assertEquals("Project X", project1.getProject_name());
        Assertions.assertEquals("John Doe", project1.getProject_Under_Who());
        Assertions.assertEquals("2022-01-01", project1.getStart_date());
        Assertions.assertEquals("2022-12-31", project1.getEnd_date());

        Project project2 = new Project("Project Y", "Jane Doe", "2023-01-01", "2023-12-31");
        Assertions.assertNull(project2.getProject_id());
        Assertions.assertEquals("Project Y", project2.getProject_name());
        Assertions.assertEquals("Jane Doe", project2.getProject_Under_Who());
        Assertions.assertEquals("2023-01-01", project2.getStart_date());
        Assertions.assertEquals("2023-12-31", project2.getEnd_date());
    }
}

/*This unit test covers the getters and setters methods as well as the two constructors of the Project class.
 It ensures that the values set through the setters are retrieved correctly through the getters and that the constructors set the values properly.
 */