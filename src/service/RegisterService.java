package service;

import bean.User;
import config.Config;
import service.impl.RegisterServiceImpl;
import util.InputUtil;

/**
 *
 * @author ilahe
 */
public class RegisterService implements RegisterServiceImpl{

    @Override
    public void process() {
        int countContestant = InputUtil.requireNumber("How many people will participate in the competition?");
        for (int i = 0; i < countContestant; i++) {
            String name = InputUtil.requireName();
            String surname = InputUtil.requireSurname();
            int age = InputUtil.requireAge();
            User u = new User(name, surname, age);
            Config.getInstance().appendUser(u);
            
        }
        System.out.println("Contestants have successfully registered.");
    }

}
