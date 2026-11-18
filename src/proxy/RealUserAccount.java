// Установка пакета
package proxy;

// Импорт пакетов
import static java.lang.System.out;

// Класс "Реальный аккаунт пользователя" (реализация паттерна "Proxy")
public final class RealUserAccount implements UserAccount {

    // Поля
    private final String name;  // полное имя пользователя
    private final short[] dateOfBirth;  // дата рождения пользователя: число, месяц, год
    private final String email;  // электронная почта пользователя
    private final String phoneNumber;  // мобильный номер телефона пользователя

    // Конструкторы
    public RealUserAccount(String name, short[] dateOfBirth, String email, String phoneNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth.clone();
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public short[] getDateOfBirth() {
        return this.dateOfBirth.clone();
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // Методы

    // Метод просмотра личных данных пользователя
    @Override
    public void view() {
        out.print("-------------------------------------------------------------------------\n");
        out.printf("Полное имя: %s\n", this.name);
        out.printf("Дата рождения: %d.%d.%d\n", this.dateOfBirth[0],
                   this.dateOfBirth[1], this.dateOfBirth[2]);
        out.printf("E-mail: %s\n", this.email);
        out.printf("Мобильный номер телефона: %s\n", this.phoneNumber);
        out.print("-------------------------------------------------------------------------\n");
    }

    // Метод удаления аккаунта пользователя
    @Override
    public void delete() {
        out.print("Аккаунт пользователя удален\n");
    }

}
