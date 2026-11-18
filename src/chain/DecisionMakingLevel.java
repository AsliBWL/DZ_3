// Установка пакета
package chain;

// Абстрактный класс "Уровень принятия решения о выделении бюджетных средств"
// (реализация паттерна "Chain of Responsibility")
public abstract class DecisionMakingLevel {

    // Поля
    private final DecisionMakingLevel next;  // следующий уровень принятия решения

    // Конструкторы
    public DecisionMakingLevel(DecisionMakingLevel next) {
        this.next = next;
    }

    // Getters
    public DecisionMakingLevel getNext() {
        return this.next;
    }

    // Методы

    // Метод принятия решения о выделении или невыделении amount бюджетных средств
    public abstract void makeDecision(double amount);

}
