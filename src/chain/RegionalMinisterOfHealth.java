// Установка пакета
package chain;

// Класс "Министр здравоохранения региона" (реализация паттерна "Chain of Responsibility")
public class RegionalMinisterOfHealth extends DecisionMakingLevel {

    // Конструкторы
    public RegionalMinisterOfHealth(DecisionMakingLevel next) {
        super(next);
    }

    // Методы

    // Метод принятия решения о выделении или невыделении amount бюджетных средств
    @Override
    public void makeDecision(double amount) {
        if(amount <= 100_000_000) {
            System.out.print("-------------------------------------------------------------------------\n");
            System.out.printf("Выделить %f рублей из бюджетных средств\n", amount);
            System.out.print("-------------------------------------------------------------------------\n");
        }
        else {
            System.out.print("-------------------------------------------------------------------------\n");
            System.out.printf("""
                                Решение о выделении %f рублей из бюджетных средств
                                не может быть принято министром здравоохранения региона.
                                Передаем этот вопрос министерству здравоохранения РФ\n""", amount);
            System.out.print("-------------------------------------------------------------------------\n");
            this.getNext().makeDecision(amount);
        }
    }

}
