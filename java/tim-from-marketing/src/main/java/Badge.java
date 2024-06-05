import java.util.Arrays;
import java.util.stream.Collectors;

class Badge {

    public Badge() {
    }
    public String print(Integer id, String name, String department) {
        if (department == null) {
            department = "owner";
        }

        if (id == null) {
            return String.format("%s - %s", name, department.toUpperCase());
        } else {
            return String.format("[%d] - %s - %s", id, name, department.toUpperCase());
        }
    }
}
