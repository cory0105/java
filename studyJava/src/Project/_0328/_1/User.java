package Project._0328._1;

public class User{
    private String name;
    private String id;
    private String password;
    private String email;
    public User() {
    }

    public User(String name, String id, String password, String email) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
    }
    public User(String[] arrays){
        arrays[0]=this.name;
        arrays[1]=this.id;
        arrays[2]=this.password;
        arrays[3]=this.email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
