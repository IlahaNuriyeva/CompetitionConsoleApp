package service;

import bean.User;
import service.impl.StartCompetitionServiceImpl;
import config.Config;
import java.util.Random;
import util.InputUtil;

/**
 *
 * @author ilahe
 */
public class StartCompetitionService implements StartCompetitionServiceImpl {

    @Override
    public void process() {
        
        Config.showAllUsers();
        
        User[] users = Config.getInstance().getUsers();  
        int estimatedNumber = InputUtil.requireNumber("Who do you think is the winner?");
        int high = users.length; 
        Random r = new Random();
        int low = 1;
        int result = r.nextInt(high - low) + low;

        if (result == (estimatedNumber-1)) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("You failed!");
        }
    }

}
