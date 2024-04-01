package Study.Generic._0401.P588;

public class Soulution1_UsingObject {
    public static void main(String[] args) {
        // Goods를 이용해 Apple 객체를 추가하거나 가져오기
        Goods goods1 = new Goods();
        goods1.setObject(new Apple());
        Apple apple = (Apple)goods1.getObject();

        // Goods를 이용해 Pencil 객체를 추가하거나 가져오기
        Goods goods2 = new Goods();
        goods2.setObject(new Pencil());
        Pencil pencil = (Pencil)goods2.getObject();

//        Apple apple2 = (Apple)goods2.getObject();
    }
}

class Apple{}
class Pencil{}
class Goods{
    private Object object = new Object();
    public Object getObject(){
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
}