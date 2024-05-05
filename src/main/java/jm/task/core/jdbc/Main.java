package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("alex", "alex", (byte) 23);
        userDaoJDBC.saveUser("oleg", "alex", (byte) 24);
        userDaoJDBC.saveUser("olga", "alex", (byte) 25);
        userDaoJDBC.saveUser("alexander", "alex", (byte) 26);
        userDaoJDBC.getAllUsers();
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}
