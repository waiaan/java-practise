
class Test1 {
    static void eat(Animal a) {
        a.eat();
        a.sleep();
    }
}

public class Test {
    public static void main(String[] args) {
        Cat a = new Cat();
        Cat c = (Cat) a;
        Test1.eat(c);
    }
}