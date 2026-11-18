package adapter;// Импорт пакетов
import java.util.*;

// Класс "Видеофайл" (реализация паттерна "Adapter")
public final class Video {

    // Поля
    private final String pathToFile;    // путь к видеофайлу
    private final List<String> frames;  // список кадров (3-х мерных массивов со значениями каналов пикселей)

    // Конструкторы
    public Video(String pathToFile) {
        this.pathToFile = pathToFile;
        if(this.pathToFile != null) {
            List<String> frames = new ArrayList<>();
            for(int i = 0; i < 60; i++) {
                frames.add("кадр № " + String.valueOf(i + 1));
            }
            this.frames = frames;
        }
        else {
            this.frames = null;
        }
    }

    // Getters
    public String getPathToFile() {
        return this.pathToFile;
    }

    public List<String> getFrames() {
        return new ArrayList<>(this.frames);
    }

}
