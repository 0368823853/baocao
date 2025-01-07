package DemoApplication.demoaplicarion.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tblthongtin")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String email;
    private String sdt;
    private int age;

    public Student() {
    }

    public Student(int id, String name, String email, String sdt, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.sdt = sdt;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
