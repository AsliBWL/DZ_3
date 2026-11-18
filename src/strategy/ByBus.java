// Установка пакета
package strategy;

// Класс "На автобусе" (реализация паттерна "Strategy")
public class ByBus implements MovementType {

    // Методы

    // Метод передвижения
    @Override
    public void move() {
        System.out.print("Едем на автобусе");
    }

}
