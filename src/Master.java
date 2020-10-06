public class Master {
    private final String name;  // Фамилия, имя

    Master(String Name) {
        this.name = Name;
    }

    String GetName() {
        return this.name;
    }

    // Другие сведения
    public void getFood(int food, int drink, String korm) {
        // Кормление
        System.out.println(korm);
    }
}
