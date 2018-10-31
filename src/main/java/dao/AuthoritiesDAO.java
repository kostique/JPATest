package dao;
import entities.Authorities;

import java.sql.SQLException;
import java.util.List;

public interface AuthoritiesDAO {

    //create
    void add(Authorities authorities) throws SQLException;

    //read
    List<Authorities> getAll() throws SQLException;

    Authorities getById(Long id) throws SQLException;

    //update
    void update(long id, String name) throws SQLException;

    //delete
    void remove(long id) throws SQLException;
}
