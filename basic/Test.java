
class Grand {
    public void show() {
        System.out.println("grand show");
    }
}

class Father extends Grand {

}

class Son extends Father {

}

public class Test {
    public static void main(String[] args) {
        new Son().show();
    }
}