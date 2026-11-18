// Установка пакета
package strategy;

// Класс "На самокате" (реализация паттерна "Strategy")
public class ByScooter implements MovementType {

    // Методы

    // Метод передвижения
    @Override
    public void move() {
        System.out.print("Едем на самокате");
    }

}
