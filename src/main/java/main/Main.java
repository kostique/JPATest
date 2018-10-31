package main;

import entities.Authorities;
import org.hibernate.cfg.Configuration;
import service.AuthoritiesService;
import service.impl.AuthoritiesServiceImpl;
import util.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hi");

//        Authorities a = new Authorities();
//        a.setName("theBoss");
//        AuthoritiesService authoritiesService = new AuthoritiesServiceImpl();
//        authoritiesService.createAuthorities(a);



        AuthoritiesService authoritiesService = new AuthoritiesServiceImpl();
        Authorities authorities = new Authorities();
        authorities.setName("Shlang");
        authoritiesService.createAuthorities(authorities);


        authoritiesService.updateAuthorities(8, "KnyazSupinator");
//        authoritiesService.createAuthorities(authorities);
//        authoritiesService.createAuthorities(authorities);
//        authoritiesService.updateAuthorities(2, "Shucher");
        List<Authorities> authoritiesList = authoritiesService.getAuthoritiesList();
        System.out.println("authoritiesList = " + authoritiesList);

        for(int i = 3; i < 14; i++) {
            authoritiesService.deleteAuthorities(i);
        }



        PersistenceUtil.close();
    }
}
