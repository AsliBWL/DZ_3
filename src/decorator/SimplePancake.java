package decorator;

// Класс "Обычный блин" (реализация паттерна "Decorator")
public class SimplePancake implements Pancake {

    // Методы

    // Метод, возвращающий описание блина
    @Override
    public String description() {
        return "Блин";
    }

    // Метод, возвращающий цену блина
    @Override
    public double cost() {
        return 20;
    }

}
