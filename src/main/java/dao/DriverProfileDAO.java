package dao;

import entities.Authorities;
import entities.DriverProfile;

import java.sql.SQLException;
import java.util.List;

public interface DriverProfileDAO {

    //create
    void add(DriverProfile driverProfile) throws SQLException;

    //read
    List<DriverProfile> getAll() throws SQLException;

    DriverProfile getById(Long id) throws SQLException;

    //update
    void update(DriverProfile driverProfile) throws SQLException;

    //delete
    void remove(DriverProfile driverProfile) throws SQLException;
}
