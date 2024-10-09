package zoo;

import java.util.Objects;

/**
 * Клас, що представляє тварину в зоопарку.
 * Містить інформацію про ім'я, стать, дату народження, дату прибуття, стан здоров'я,
 * розділ зоопарку та тип їжі.
 */
public class Animal {
    private String name;
    private String gender;
    private String birthDate;
    private String arrivalDate;
    private HealthStatus healthStatus;
    private Section section;
    private String foodName;

    /**
     * Конструктор класу Animal, використовується для створення об'єкта за допомогою Builder.
     *
     * @param builder об'єкт AnimalBuilder, що містить усі поля для ініціалізації
     */
    protected Animal(AnimalBuilder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.birthDate = builder.birthDate;
        this.arrivalDate = builder.arrivalDate;
        this.healthStatus = builder.healthStatus;
        this.section = builder.section;
        this.foodName = builder.foodName;
    }

    /**
     * Повертає рядкове представлення об'єкта Animal.
     * Включає всі поля: ім'я, стать, дату народження, дату прибуття, стан здоров'я,
     * розділ зоопарку та тип їжі.
     *
     * @return рядок, що містить усю інформацію про тварину
     */
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", healthStatus=" + healthStatus +
                ", section=" + section +
                ", food='" + foodName + '\'' +
                '}';
    }

    /**
     * Порівнює цей об'єкт з іншим. Два об'єкти Animal рівні, якщо вони мають однакові значення
     * для всіх полів.
     *
     * @param o об'єкт для порівняння
     * @return true, якщо об'єкти рівні, false в іншому випадку
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                Objects.equals(gender, animal.gender) &&
                Objects.equals(birthDate, animal.birthDate) &&
                Objects.equals(arrivalDate, animal.arrivalDate) &&
                Objects.equals(healthStatus, animal.healthStatus) &&
                Objects.equals(section, animal.section) &&
                Objects.equals(foodName, animal.foodName);
    }

    /**
     * Генерує хеш-код для об'єкта Animal. Хеш-код створюється на основі усіх полів.
     *
     * @return хеш-код для цього об'єкта
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, gender, birthDate, arrivalDate, healthStatus, section, foodName);
    }
}
