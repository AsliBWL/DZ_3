// Установка пакета
package chain;

// Класс "Главный врач больницы" (реализация паттерна "Chain of Responsibility")
public class ChiefDoctorOfHospital extends DecisionMakingLevel {

    // Конструкторы
    public ChiefDoctorOfHospital(DecisionMakingLevel next) {
        super(next);
    }

    // Методы

    // Метод принятия решения о выделении или невыделении amount бюджетных средств
    @Override
    public void makeDecision(double amount) {
        if(amount <= 600_000) {
            System.out.print("-------------------------------------------------------------------------\n");
            System.out.printf("Выделить %f рублей из бюджетных средств\n", amount);
            System.out.print("-------------------------------------------------------------------------\n");
        }
        else {
            System.out.print("-------------------------------------------------------------------------\n");
            System.out.printf("""
                                Решение о выделении %f рублей из бюджетных средств
                                не может быть принято главным врачом больницы.
                                Передаем этот вопрос главному бухгалтеру больницы\n""", amount);
            System.out.print("-------------------------------------------------------------------------\n");
            this.getNext().makeDecision(amount);
        }
    }

}
