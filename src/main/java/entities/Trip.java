package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_trip")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shift_code")
    private String shift_code;

    @ManyToOne(fetch = FetchType.LAZY)
    private DriverProfile driverProfile;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShift_code() {
        return shift_code;
    }

    public void setShift_code(String shift_code) {
        this.shift_code = shift_code;
    }

    public DriverProfile getDriverProfile() {
        return driverProfile;
    }

    public void setDriverProfile(DriverProfile driverProfile) {
        this.driverProfile = driverProfile;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return Objects.equals(id, trip.id) &&
                Objects.equals(shift_code, trip.shift_code) &&
                Objects.equals(driverProfile, trip.driverProfile);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, shift_code, driverProfile);
    }


    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", shift_code='" + shift_code + '\'' +
                ", driverProfile=" + driverProfile +
                '}';
    }
}
