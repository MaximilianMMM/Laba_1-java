package zoo;

public class Main {
    public static void main(String[] args) {
        Section section = new Section("Savannah", "Africa Zone");
        HealthStatus healthStatus = new HealthStatus("Healthy");

        Animal animal = new AnimalBuilder()
                .setName("Lion")
                .setGender("Male")
                .setBirthDate("2020-03-15")
                .setArrivalDate("2021-05-20")
                .setHealthStatus(healthStatus)
                .setSection(section)
                .setFoodName("Meat")
                .build();

        System.out.println(animal);
    }
}
