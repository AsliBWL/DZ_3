package decorator;

// Декоратор "Мед" класса "Блин" (реализация паттерна "Decorator")
public class HoneyDecorator extends PancakeDecorator {

    // Конструкторы
    public HoneyDecorator(Pancake pancake) {
        super(pancake);
    }

    // Методы

    // Метод, возвращающий описание блина
    @Override
    public String description() {
        return this.pancake.description() + " + мед";
    }

    // Метод, возвращающий цену блина
    @Override
    public double cost() {
        return this.pancake.cost() + 10;
    }

}
