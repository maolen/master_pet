public class Master {
    // Фамилия, имя
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Другие сведения
    public void getFood(int food, int drink, String korm) {
        // Кормление
        System.out.println(korm);
    }
}
