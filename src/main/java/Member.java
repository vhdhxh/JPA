import javax.persistence.Entity;

@Entity
public class Member {
    private String student;

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudent() {
        return student;
    }
}
