package zoo;

public class HealthStatus {
    private int healthStatusId;
    private String status;

    public HealthStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HealthStatus{" +
                "status='" + status + '\'' +
                '}';
    }
}
