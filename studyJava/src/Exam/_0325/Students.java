package Exam._0325;

public class Students{

    public String name;
    public String department;
    public int studentId;

    public void setName(String name){
                this.name = name;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setStudentId(int studentId){
                this.studentId = studentId;
    }
    public String toString(){
                return this.name + ", " + this.department + ", " + this.studentId;
    }

    public Students(){};

    public Students(String name, String department, int studentId) {
        this.name = name;
        this.department = department;
        this.studentId = studentId;
    }
}
