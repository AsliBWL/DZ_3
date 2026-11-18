// Установка пакета
package chain;

// Класс "Минздрав РФ" (реализация паттерна "Chain of Responsibility")
public class MinistryOfHealth extends DecisionMakingLevel {

    // Конструкторы
    public MinistryOfHealth(DecisionMakingLevel next) {
        super(next);
    }

    // Методы

    // Метод принятия решения о выделении или невыделении amount бюджетных средств
    @Override
    public void makeDecision(double amount) {
        System.out.print("-------------------------------------------------------------------------\n");
        System.out.printf("Выделить %f рублей из бюджетных средств\n", amount);
        System.out.print("-------------------------------------------------------------------------\n");
    }

}
