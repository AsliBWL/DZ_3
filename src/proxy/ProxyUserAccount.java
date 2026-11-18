// Установка пакета
package proxy;

// Класс "Прокси реального аккаунта пользователя, проверяющий права доступа к нему" (реализация паттерна "Proxy")
public class ProxyUserAccount implements UserAccount {

    // Поля
    private RealUserAccount realUserAccount;  // реальный аккаунт пользователя
    private String role;                      // роль того, кто совершает манипуляции
                                              // над реальным аккаунтом пользователя

    // Конструкторы
    public ProxyUserAccount(RealUserAccount realUserAccount, String role) {
        this.realUserAccount = realUserAccount;
        this.role = role;
    }

    // Getters
    public RealUserAccount getRealUserAccount() {
        return this.realUserAccount;
    }

    public String getRole() {
        return this.role;
    }

    // Setters
    public void setRealUserAccount(RealUserAccount realUserAccount) {
        this.realUserAccount = realUserAccount;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Методы

    // Метод просмотра личных данных пользователя
    @Override
    public void view() {
        this.realUserAccount.view();
    }

    // Метод удаления аккаунта пользователя
    @Override
    public void delete() {
        if("admin".equals(this.role)) {
            this.realUserAccount.delete();
            this.realUserAccount = null;
        }
        else {
            System.out.printf("У %s нет прав на удаление аккаунта пользователя %s\n",
                              this.role, this.realUserAccount.getName());
        }
    }

}
