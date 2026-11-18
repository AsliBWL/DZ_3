package decorator;

// Декоратор "Творог" класса "Блин" (реализация паттерна "Decorator")
public class CurdDecorator extends PancakeDecorator {

    // Конструкторы
    public CurdDecorator(Pancake pancake) {
        super(pancake);
    }

    // Методы

    // Метод, возвращающий описание блина
    @Override
    public String description() {
        return this.pancake.description() + " + творог";
    }

    // Метод, возвращающий цену блина
    @Override
    public double cost() {
        return this.pancake.cost() + 30;
    }

}
