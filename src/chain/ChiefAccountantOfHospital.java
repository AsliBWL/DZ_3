// Установка пакета
package chain;

// Класс "Главный бухгалтер больницы" (реализация паттерна "Chain of Responsibility")
public class ChiefAccountantOfHospital extends DecisionMakingLevel {

    // Конструкторы
    public ChiefAccountantOfHospital(DecisionMakingLevel next) {
        super(next);
    }

    // Методы

    // Метод принятия решения о выделении или невыделении amount бюджетных средств
    @Override
    public void makeDecision(double amount) {
        if(amount <= 3_000_000) {
            System.out.print("-------------------------------------------------------------------------\n");
            System.out.printf("Выделить %f рублей из бюджетных средств\n", amount);
            System.out.print("-------------------------------------------------------------------------\n");
        }
        else {
            System.out.print("-------------------------------------------------------------------------\n");
            System.out.printf("""
                                Решение о выделении %f рублей из бюджетных средств
                                не может быть принято главным бухгалтером больницы.
                                Передаем этот вопрос финансовой комиссии больницы\n""", amount);
            System.out.print("-------------------------------------------------------------------------\n");
            this.getNext().makeDecision(amount);
        }
    }

}
