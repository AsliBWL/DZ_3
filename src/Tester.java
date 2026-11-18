// Импорт пакетов
import strategy.*;
import chain.*;
import builder.*;
import proxy.*;
import decorator.*;
import adapter.*;
import java.util.*;
import static java.lang.System.out;

// Класс "Тестировщик"
public class Tester {

    // Методы

    // Метод тестирования реализации паттерна "Strategy"
    public static void testStrategy() {
        out.print("=========================================================================\n");
        out.print("Демонстрация работы паттерна \"Strategy\"\n");
        out.print("=========================================================================\n");
        Travel travel1 = new Travel("пр. Кирова, 2", "пр. Ленина, 1", new OnFoot());
        Travel travel2 = new Travel("пр. Кирова, 2", "пр. Ленина, 1", new ByScooter());
        Travel travel3 = new Travel("пр. Кирова, 2", "пр. Ленина, 1", new ByBus());
        Travel travel4 = new Travel("пр. Кирова, 2", "пр. Ленина, 1", new ByTaxi());
        travel1.go();
        travel2.go();
        travel3.go();
        travel4.go();
        out.print("=========================================================================\n");
    }

    // Метод тестирования реализации паттерна "Chain of Responsibility"
    public static void testChainOfResponsibility() {
        out.print("=========================================================================\n");
        out.print("Демонстрация работы паттерна \"Chain of Responsibility\"\n");
        out.print("=========================================================================\n");
        DecisionMakingLevel chain = new ChiefDoctorOfHospital(
                new ChiefAccountantOfHospital(
                        new HospitalFinanceCommittee(
                                new DeputyRegionalMinisterOfHealth(
                                        new RegionalMinisterOfHealth(
                                                new MinistryOfHealth(null)
                                        )
                                )
                        )
                ));
        chain.makeDecision(4_000_000);
        out.print("=========================================================================\n");
    }

    // Метод тестирования реализации паттерна "Builder"
    public static void testBuilder() {
        out.print("=========================================================================\n");
        out.print("Демонстрация работы паттерна \"Builder\"\n");
        out.print("=========================================================================\n");
        House house = new House.Builder()
                .numOfFloors((byte) 2)
                .numOfBedrooms((byte) 4)
                .numOfBathrooms((byte) 4)
                .presenceOfDiningRoom(true)
                .presenceOfLivingRoom(true)
                .presenceOfBasement(true)
                .presenceOfMansard(true)
                .architecturalStyle("шале")
                .additional("бассейн", "фитнес-зал", "сад с качелями", "библиотека")
                .build();
        String description = house.toString();
        System.out.print(description);
        out.print("=========================================================================\n");
    }

    // Метод тестирования реализации паттерна "Proxy"
    public static void testProxy() {
        out.print("=========================================================================\n");
        out.print("Демонстрация работы паттерна \"Proxy\"\n");
        out.print("=========================================================================\n");
        RealUserAccount realUserAccount = new RealUserAccount(
                "Хаирзаманова Ассоль Владиславовна", new short[] {11, 5, 2003},
                "gentrifikaziy@mail.ru", "8-964-211-91-36");
        UserAccount proxyUserAccountUser = new ProxyUserAccount(realUserAccount, "user");
        UserAccount proxyUserAccountAdmin = new ProxyUserAccount(realUserAccount, "admin");
        out.print("Доступ к аккаунту пользователя запрашивает user\n");
        out.print("Просмотреть личные данные пользователя:\n");
        proxyUserAccountUser.view();
        out.print("Удалить аккаунт пользователя:\n");
        proxyUserAccountUser.delete();
        out.print("-------------------------------------------------------------------------\n");
        out.print("Доступ к аккаунту пользователя запрашивает admin\n");
        out.print("Просмотреть личные данные пользователя:\n");
        proxyUserAccountAdmin.view();
        out.print("Удалить аккаунт пользователя:\n");
        proxyUserAccountAdmin.delete();
        out.print("=========================================================================\n");
    }

    // Метод тестирования реализации паттерна "Decorator"
    public static void testDecorator() {
        out.print("=========================================================================\n");
        out.print("Демонстрация работы паттерна \"Decorator\"\n");
        out.print("=========================================================================\n");
        Pancake pancake1 = new HoneyDecorator(new SimplePancake());
        Pancake pancake2 = new StrawberryJamDecorator(new CurdDecorator(new SimplePancake()));
        out.print("Блин № 1\n");
        out.printf("Описание: %s\n", pancake1.description());
        out.printf("Цена: %f руб\n", pancake1.cost());
        out.print("-------------------------------------------------------------------------\n");
        out.print("Блин № 2\n");
        out.printf("Описание: %s\n", pancake2.description());
        out.printf("Цена: %f руб\n", pancake2.cost());
        out.print("=========================================================================\n");
    }

    // Метод тестирования реализации паттерна "Adapter"
    public static void testAdapter() {
        out.print("=========================================================================\n");
        out.print("Демонстрация работы паттерна \"Adapter\"\n");
        out.print("=========================================================================\n");
        VisualSource sourceImage = new ImageSource(new Image("путь_к_файлу_изображения"));
        VisualSource sourceVideo = new VideoSource(new Video("путь_к_видеофайлу"));
        List<String> listImage = sourceImage.getVisualData();
        List<String> listVideo = sourceVideo.getVisualData();
        out.print("Изображение: " + String.join(", ", listImage) + "\n");
        out.print("-------------------------------------------------------------------------\n");
        out.print("Видео: " + String.join(", ", listVideo) + "\n");
        out.print("=========================================================================\n");
    }

}
