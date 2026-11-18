// Установка пакета
package strategy;

// Класс "Поездка" (реализация паттерна "Strategy")
public final class Travel {

    // Поля
    private final String pointOfDeparture;    // место отправки
    private final String pointOfArrival;      // место прибытия
    private final MovementType movementType;  // тип передвижения

    // Конструкторы
    public Travel(String pointOfDeparture, String pointOfArrival, MovementType movementType) {
        this.pointOfDeparture = pointOfDeparture;
        this.pointOfArrival = pointOfArrival;
        this.movementType = movementType;
    }

    // Getters
    public String getPointOfDeparture() {
        return this.pointOfDeparture;
    }

    public String getPointOfArrival() {
        return this.pointOfArrival;
    }

    public MovementType getMovementType() {
        return this.movementType;
    }

    // Методы

    // Метод совершения поездки
    public void go() {
        System.out.print(this.pointOfDeparture + " -> ");
        this.movementType.move();
        System.out.print(" -> " + this.pointOfArrival + "\n");
    }

}
