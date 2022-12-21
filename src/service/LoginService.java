package service;

import config.Config;
import service.impl.LoginServiceImpl;
import util.InputUtil;

/**
 *
 * @author ilahe
 */
public class LoginService implements LoginServiceImpl {

    private static final int count = 3;

    @Override
    public void process() {

        for (int i = 1; i <= count; i++) {
            String username = InputUtil.requireUsername();
            String password = InputUtil.requirePassword();
            if (!(username.equals("admin") && password.equals("admin"))) {
                if (i < 3) {
                    System.out.println("Try again");
                } else {
                    System.out.println("You banned!");
                    System.exit(0);
                }
            } else if (username.equals("admin") && password.equals("admin")) {
                Config.setLoggedIn(true);
                System.out.println("Logged in succesfully!");
                break;
            }

        }

    }

}
