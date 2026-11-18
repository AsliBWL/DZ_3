// Установка пакета
package strategy;

// Класс "На такси" (реализация паттерна "Strategy")
public class ByTaxi implements MovementType {

    // Методы

    // Метод передвижения
    @Override
    public void move() {
        System.out.print("Едем на такси");
    }

}
