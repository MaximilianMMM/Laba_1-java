package zoo;

public class AnimalBuilder {
    public String name;
    public String gender;
    public String birthDate;
    public String arrivalDate;
    public HealthStatus healthStatus;
    public Section section;
    public String foodName;

    public AnimalBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AnimalBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public AnimalBuilder setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public AnimalBuilder setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
        return this;
    }

    public AnimalBuilder setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    public AnimalBuilder setSection(Section section) {
        this.section = section;
        return this;
    }

    public AnimalBuilder setFoodName(String foodName) {
        this.foodName = foodName;
        return this;
    }

    public Animal build() {
        return new Animal(this);
    }
}
