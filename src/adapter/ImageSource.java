package adapter;// Импорт пакетов
import java.util.*;

// Класс "Изображение-адаптер" (реализация паттерна "Adapter")
public final class ImageSource implements VisualSource {

    // Поля
    private final Image image;

    // Конструкторы
    public ImageSource(Image image) {
        this.image = image;
    }

    // Getters
    public Image getImage() {
        return this.image;
    }

    // Методы

    // Метод получения списка с визуальными данными
    @Override
    public List<String> getVisualData() {
        return this.image.getListImage();
    }

}
