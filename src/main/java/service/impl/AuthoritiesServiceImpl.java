package service.impl;

import dao.impl.AuthoritiesDAOImpl;
import entities.Authorities;
import service.AuthoritiesService;

import java.sql.SQLException;
import java.util.List;

public class AuthoritiesServiceImpl implements AuthoritiesService {
    @Override
    public void createAuthorities(Authorities authorities) throws SQLException {
        new AuthoritiesDAOImpl().add(authorities);
    }

    @Override
    public Authorities getAuthoritiesById(Long id) throws SQLException {
        return new AuthoritiesDAOImpl().getById(id);
    }

    @Override
    public List<Authorities> getAuthoritiesList() throws SQLException {
        return new AuthoritiesDAOImpl().getAll();
    }

    @Override
    public void updateAuthorities(long id, String name) throws SQLException {
        new AuthoritiesDAOImpl().update(id, name);
    }

    @Override
    public void deleteAuthorities(long id) throws SQLException {
        new AuthoritiesDAOImpl().remove(id);
    }
}
