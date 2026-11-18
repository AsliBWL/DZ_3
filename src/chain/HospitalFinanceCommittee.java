// Установка пакета
package chain;

// Класс "Финансовая комиссия больницы" (реализация паттерна "Chain of Responsibility")
public class HospitalFinanceCommittee extends DecisionMakingLevel {

    // Конструкторы
    public HospitalFinanceCommittee(DecisionMakingLevel next) {
        super(next);
    }

    // Методы

    // Метод принятия решения о выделении или невыделении amount бюджетных средств
    @Override
    public void makeDecision(double amount) {
        if(amount <= 5_000_000) {
            System.out.print("-------------------------------------------------------------------------\n");
            System.out.printf("Выделить %f рублей из бюджетных средств\n", amount);
            System.out.print("-------------------------------------------------------------------------\n");
        }
        else {
            System.out.print("-------------------------------------------------------------------------\n");
            System.out.printf("""
                                Решение о выделении %f рублей из бюджетных средств
                                не может быть принято финансовой комиссией больницы.
                                Передаем этот вопрос заместителю министра здравоохранения региона\n""", amount);
            System.out.print("-------------------------------------------------------------------------\n");
            this.getNext().makeDecision(amount);
        }
    }
}
