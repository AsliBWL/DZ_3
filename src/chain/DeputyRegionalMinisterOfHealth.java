// Установка пакета
package chain;

// Класс "Заместитель министра здравоохранения региона" (реализация паттерна "Chain of Responsibility")
public class DeputyRegionalMinisterOfHealth extends DecisionMakingLevel {

    // Конструкторы
    public DeputyRegionalMinisterOfHealth(DecisionMakingLevel next) {
        super(next);
    }

    // Методы

    // Метод принятия решения о выделении или невыделении amount бюджетных средств
    @Override
    public void makeDecision(double amount) {
        if(amount <= 30_000_000) {
            System.out.print("-------------------------------------------------------------------------\n");
            System.out.printf("Выделить %f рублей из бюджетных средств\n", amount);
            System.out.print("-------------------------------------------------------------------------\n");
        }
        else {
            System.out.print("-------------------------------------------------------------------------\n");
            System.out.printf("""
                                Решение о выделении %f рублей из бюджетных средств
                                не может быть принято заместителем министра здравоохранения региона.
                                Передаем этот вопрос министру здравоохранения региона\n""", amount);
            System.out.print("-------------------------------------------------------------------------\n");
            this.getNext().makeDecision(amount);
        }
    }

}
