// Установка пакета
package strategy;

// Класс "Пешком" (реализация паттерна "Strategy")
public class OnFoot implements MovementType {

    // Методы

    // Метод передвижения
    @Override
    public void move() {
        System.out.print("Идем пешком");
    }

}
