package decorator;

// Декоратор "Клубничное варенье" класса "Блин" (реализация паттерна "Decorator")
public class StrawberryJamDecorator extends PancakeDecorator {

    // Конструкторы
    public StrawberryJamDecorator(Pancake pancake) {
        super(pancake);
    }

    // Методы

    // Метод, возвращающий описание блина
    @Override
    public String description() {
        return this.pancake.description() + " + клубничное варенье";
    }

    // Метод, возвращающий цену блина
    @Override
    public double cost() {
        return this.pancake.cost() + 15;
    }

}
