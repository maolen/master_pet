public abstract class Pet {     // Здесь описываем общие свойства всех домашних любимцев
    Master person; // Хозяин животного
    int weight, age, eatTime1;   // Вес, возраст, время кормления

    int eat(int food, int drink, int time, String korm) { // Процесс кормления
        // Начальные действия...
        if (time == eatTime1) {
            person.getFood(food, drink, korm);
            return 1;
        } else return 0;
        // Метод потребления пищи
    }
}