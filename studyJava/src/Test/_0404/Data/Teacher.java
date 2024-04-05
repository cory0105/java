package Test._0404.Data;

import java.time.LocalDate;

public class Teacher {
    String teacherId;
    String name;
    String password;
    LocalDate birthDate;
    String email;

    public Teacher() {
    }

    public Teacher(String teacherId, String name, String password, LocalDate birthDate, String email) {
        this.teacherId = teacherId;
        this.name = name;
        this.password = password;
        this.birthDate = birthDate;
        this.email = email;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
