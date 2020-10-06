public class Main {
    public static void main(String[] args) {
        Voice[] singer = new Voice[4];
        singer[0] = new Dog();
        singer[1] = new Cat();
        singer[2] = new Cow();
        singer[3] = new Bee();
        for (Voice voice : singer) voice.voice();
    }
}