// Здесь описываем общие свойства всех домашних любимцев
public abstract class Pet {
    // Хозяин животного
    private Master person;

    // Вес
    private int weight;

    // Возраст
    private int age;

    // Время кормления
    private int eatTime;

    // Процесс кормления
    public int eat(int food, int drink, int time, String korm) {
        // Начальные действия...
        if (time == eatTime) {
            person.getFood(food, drink, korm);
            return 1;
        } else return 0;
        // Метод потребления пищи
    }
}