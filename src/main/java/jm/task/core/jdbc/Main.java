package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("alex", "alex", (byte) 23);
        userService.saveUser("oleg", "alex", (byte) 24);
        userService.saveUser("olga", "alex", (byte) 25);
        userService.saveUser("alexander", "alex", (byte) 26);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
