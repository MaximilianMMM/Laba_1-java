package zoo;

public class Section {
    private int sectionId;
    private String sectionName;
    private String location;

    public Section(String sectionName, String location) {
        this.sectionName = sectionName;
        this.location = location;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionName='" + sectionName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
