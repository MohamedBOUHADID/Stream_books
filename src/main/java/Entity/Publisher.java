package Entity;

import java.util.Objects;

public class Publisher {
    private int id;
    private String pulisherName;

    public Publisher(int id, String pulisherName) {
        this.id = id;
        this.pulisherName = pulisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", pulisherName='" + pulisherName + '\'' +
                '}';
    }

    public Publisher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPulisherName() {
        return pulisherName;
    }

    public void setPulisherName(String pulisherName) {
        this.pulisherName = pulisherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return id == publisher.id &&
                Objects.equals(pulisherName, publisher.pulisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pulisherName);
    }
}
