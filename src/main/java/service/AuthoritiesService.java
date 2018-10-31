package service;

import entities.Authorities;

import java.sql.SQLException;
import java.util.List;

public interface AuthoritiesService {

    void createAuthorities(Authorities authorities) throws SQLException;

    Authorities getAuthoritiesById(Long id) throws SQLException;

    List<Authorities> getAuthoritiesList() throws SQLException;

    void updateAuthorities(long id, String name) throws SQLException;

    void deleteAuthorities(long id) throws SQLException;
}
