package adapter;// Импорт пакетов
import java.util.*;

// Класс "Изображение" (реализация паттерна "Adapter")
public final class Image {

    // Поля
    private final String pathToFile;  // путь к файлу изображения
    private final String image;       // изображение (3-х мерный массив со значениями каналов пикселей)

    // Конструкторы
    public Image(String pathToFile) {
        this.pathToFile = pathToFile;
        this.image = (this.pathToFile != null) ? "изображение" : null;
    }

    // Getters
    public String getPathToFile() {
        return this.pathToFile;
    }

    public String getImage() {
        return this.image;
    }

    // Методы

    // Метод получения списка с изображением
    public List<String> getListImage() {
        List<String> list = new ArrayList<>();
        list.add(this.image);
        return list;
    }

}
