public class Cat extends Animal {
    String name = "cat";

    @Override
    void eat() {
        System.out.println("cat eat");
    }

    void play() {
        System.out.println("cat play");
    }

}
