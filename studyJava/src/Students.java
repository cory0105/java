public class Students {
    String name; // 필드
    private int age;
    private String address;
    private String perNum;

    public Students() { // 기본 생성자
    }

    public Students(String name, int age, String address, String perNum) { // 생성자
        this.name = name;
        this.age = age;
        this.address = address;
        this.perNum = perNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPerNum() {
        return perNum;
    }


    public void displayName(){ // 메소드
        System.out.println(this.name);
    }

    public void displayAge(){
        System.out.println(this.age);
    }

    public void displayaddress(){
        System.out.println(this.address);
    }

    public void displayAll(){
        System.out.println("이름 : " + this.name + ", 나이 : " + this.age + ", 주소 : " + this.address);
    }
}










