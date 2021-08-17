public class Dog extends Animal {
    String name = "dog";

    @Override
    void eat() {
        System.out.println("dog eat");
    }

    void play() {
        System.out.println("dog play");
    }
}
