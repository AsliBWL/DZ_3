package adapter;// Импорт пакетов
import java.util.*;

// Класс "Видеофайл-адаптер" (реализация паттерна "Adapter")
public final class VideoSource implements VisualSource {

    // Поля
    private final Video video;

    // Конструкторы
    public VideoSource(Video video) {
        this.video = video;
    }

    // Getters
    public Video getVideo() {
        return this.video;
    }

    // Методы

    // Метод получения списка с визуальными данными
    @Override
    public List<String> getVisualData() {
        return this.video.getFrames();
    }

}
