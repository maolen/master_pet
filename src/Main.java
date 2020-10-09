import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IVoice> singer = new ArrayList<>();
        singer.add(new Dog());
        singer.add(new Cat());
        singer.add(new Cow());
        singer.add(new Bee());
        for (IVoice voice : singer) voice.voice();
    }
}