package decorator;

// Абстрактный декоратор класса "Блин" (реализация паттерна "Decorator")
public abstract class PancakeDecorator implements Pancake {

    // Поля
    protected final Pancake pancake;

    // Конструкторы
    PancakeDecorator(Pancake pancake) {
        this.pancake = pancake;
    }

}
