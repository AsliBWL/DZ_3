// Установка пакета
package builder;

// Импорт пакетов
import java.util.*;

// Класс "Дом" (реализация паттерна "Builder")
public final class House {

    // Поля
    private final byte numOfFloors;  // количество этажей
    private final byte numOfBedrooms;  // количество спален
    private final byte numOfBathrooms;  // количество ванных комнат
    private final boolean presenceOfDiningRoom;  // наличие столовой
    private final boolean presenceOfLivingRoom;  // наличие гостиной
    private final boolean presenceOfBasement;  // наличие подвала
    private final boolean presenceOfMansard;  // наличие мансарды
    private final String architecturalStyle;  // архитектурный стиль (например, барокко)
    private final List<String> additional;   // дополнительно (например, бассейн)

    // Конструкторы
    private House(Builder builder) {
        this.numOfFloors = builder.numOfFloors;
        this.numOfBedrooms = builder.numOfBedrooms;
        this.numOfBathrooms = builder.numOfBathrooms;
        this.presenceOfDiningRoom = builder.presenceOfDiningRoom;
        this.presenceOfLivingRoom = builder.presenceOfLivingRoom;
        this.presenceOfBasement = builder.presenceOfBasement;
        this.presenceOfMansard = builder.presenceOfMansard;
        this.architecturalStyle = builder.architecturalStyle;
        this.additional = new ArrayList<>(builder.additional);
    }

    // Getters
    public byte getNumOfFloors() {
        return this.numOfFloors;
    }

    public byte getNumOfBedrooms() {
        return this.numOfBedrooms;
    }

    public byte getNumOfBathrooms() {
        return this.numOfBathrooms;
    }

    public boolean isPresenceOfDiningRoom() {
        return this.presenceOfDiningRoom;
    }

    public boolean isPresenceOfLivingRoom() {
        return this.presenceOfLivingRoom;
    }

    public boolean isPresenceOfBasement() {
        return this.presenceOfBasement;
    }

    public boolean isPresenceOfMansard() {
        return this.presenceOfMansard;
    }

    public String getArchitecturalStyle() {
        return this.architecturalStyle;
    }

    public List<String> getAdditional() {
        return new ArrayList<>(this.additional);
    }

    // Методы

    // Метод, возвращающий описание текущего объекта в формате строки
    @Override
    public String toString() {
        return "-------------------------------------------------------------------------\n" +
                "Количество этажей: " + Byte.toString(this.numOfFloors) + "\n" +
                "Количество спален: " + Byte.toString(this.numOfBedrooms) + "\n" +
                "Количество ванных комнат: " + Byte.toString(this.numOfBathrooms) + "\n" +
                "Наличие столовой: " + (this.presenceOfDiningRoom ? "да" : "нет") + "\n" +
                "Наличие гостиной: " + (this.presenceOfLivingRoom ? "да" : "нет") + "\n" +
                "Наличие подвала: " + (this.presenceOfBasement ? "да" : "нет") + "\n" +
                "Наличие мансарды: " + (this.presenceOfMansard ? "да" : "нет") + "\n" +
                "Архитектурный стиль: " + this.architecturalStyle + "\n" +
                "Дополнительно: " + String.join(", ", this.additional) + "\n" +
                "-------------------------------------------------------------------------\n";
    }

    // Класс "Строитель"
    public static class Builder {

        // Поля
        private byte numOfFloors;  // количество этажей
        private byte numOfBedrooms;  // количество спален
        private byte numOfBathrooms;  // количество ванных комнат
        private boolean presenceOfDiningRoom;  // наличие столовой
        private boolean presenceOfLivingRoom;  // наличие гостиной
        private boolean presenceOfBasement;  // наличие подвала
        private boolean presenceOfMansard;  // наличие мансарды
        private String architecturalStyle;  // архитектурный стиль (например, барокко)
        private List<String> additional;   // дополнительно (например, бассейн)

        // Fluent setters
        public Builder numOfFloors(byte numOfFloors) {
            this.numOfFloors = numOfFloors;
            return this;
        }

        public Builder numOfBedrooms(byte numOfBedrooms) {
            this.numOfBedrooms = numOfBedrooms;
            return this;
        }

        public Builder numOfBathrooms(byte numOfBathrooms) {
            this.numOfBathrooms = numOfBathrooms;
            return this;
        }

        public Builder presenceOfDiningRoom(boolean presenceOfDiningRoom) {
            this.presenceOfDiningRoom = presenceOfDiningRoom;
            return this;
        }

        public Builder presenceOfLivingRoom(boolean presenceOfLivingRoom) {
            this.presenceOfLivingRoom = presenceOfLivingRoom;
            return this;
        }

        public Builder presenceOfBasement(boolean presenceOfBasement) {
            this.presenceOfBasement = presenceOfBasement;
            return this;
        }

        public Builder presenceOfMansard(boolean presenceOfMansard) {
            this.presenceOfMansard = presenceOfMansard;
            return this;
        }

        public Builder architecturalStyle(String architecturalStyle) {
            this.architecturalStyle = architecturalStyle;
            return this;
        }

        public Builder additional(String ...additional) {
            this.additional = new ArrayList<>(Arrays.asList(additional));
            return this;
        }

        // Методы

        // Метод создания объекта класса "Дом"
        public House build() {
            return new House(this);
        }

    }

}
