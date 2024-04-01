package Study.Generic._0401;

public class Main2 {
    public static void main(String[] args) {
        KeyValue<String,Integer> kv1 = new KeyValue<>();
        kv1.setKey("사과");
        kv1.setValue(1000);
        System.out.println(kv1.getKey() + " " + kv1.getValue());
        kv1.set("딸기",10);
        System.out.println(kv1.getKey() + " " + kv1.getValue());

        // 두번째 제네릭을 사용하지 않더라도 void 타입을 지정해야 함
        KeyValue<String,Void> kv2 = new KeyValue<>();
        kv2.setKey("키값만 사용");
        System.out.println("key: " + kv2.getKey());
    }
}

class KeyValue<K,V>{
    private K key;
    private V value;
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public void setValue(V value) {
        this.value = value;
    }
    public void set(K key, V value){
        this.key = key;
        this.value = value;
    }
}