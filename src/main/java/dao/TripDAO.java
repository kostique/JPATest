package dao;

import entities.Trip;

import java.sql.SQLException;
import java.util.List;

public interface TripDAO {

    //create
    void add(Trip trip) throws SQLException;

    //read
    List<Trip> getAll() throws SQLException;

    Trip getById(Long id) throws SQLException;

    //update
    void update(Trip trip) throws SQLException;

    //delete
    void remove(Trip trip) throws SQLException;
}
