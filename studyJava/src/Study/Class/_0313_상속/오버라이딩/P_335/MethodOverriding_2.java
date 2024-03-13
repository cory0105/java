package Study.Class._0313_상속.오버라이딩.P_335;

/*메서드 오버라이딩의 대표적 예시*/

class Animal {
    String a = "동물";
    void cry() {
        System.out.println("... " + a);
    }
    static void cry2() {
        System.out.println("... ");
    }
}
class Bird extends Animal {
    String a = "새";
    @Override
    void cry() {
        System.out.println("짹짹 " + a);
    }
    static void cry2() {
        System.out.println("짹짹 ");
    }
}
class Cat extends Animal {
    String a = "고양이";
    @Override
    void cry() {
        System.out.println("야옹 " + a);
    }
    static void cry2() {
        System.out.println("야옹 ");
    }
}
class Dog extends Animal {
    String a = "개";
    @Override
    void cry() {
        System.out.println("멍멍 " + a);
    }
    static void cry2() {
        System.out.println("멍멍 ");
    }
}

public class MethodOverriding_2 {
    public static void main(String[] args) {
        //#1. 각각의 타입으로 선언 + 각각의 타입으로 생성
        Animal aa = new Animal();
        Bird bb = new Bird();
        Cat cc = new Cat();
        Dog dd = new Dog();
        aa.cry();
        bb.cry();
        cc.cry();
        dd.cry();
        aa.cry2();
        bb.cry2();
        cc.cry2();
        dd.cry2();
        System.out.println();

        //#2. Animal 타입으로 선언 + 자식클래스 타입으로 생성
        Animal ab = new Bird();
        Animal ac = new Cat();
        Animal ad = new Dog();
        ab.cry();
        ac.cry();
        ad.cry();
        ab.cry2();
        ac.cry2();
        ad.cry2();
        System.out.println();

        //#3. 배열로 관리
        Animal[] animals = {ab, ac, ad};
        for(Animal animal : animals) {
            animal.cry();
        }

        Animal[] animal2 = {ab, ac, ad};
        for(Animal animal : animals) {
            animal.cry2();
        }

        Animal[] animal3 = {aa, bb, dd};
        for(Animal animal : animals) {
            animal.cry2();
        }


    }
}