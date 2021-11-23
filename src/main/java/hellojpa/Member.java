package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    private Long id;
    private String name;
    private Long studentId;

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public Long getLong() {
        return studentId;
    }

    public void setLong(Long aLong) {
        studentId = aLong;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
