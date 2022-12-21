package service;

import config.Config;
import service.impl.ShowUsersServiceImpl;

/**
 *
 * @author ilahe
 */
public class ShowUsersService implements ShowUsersServiceImpl{

    @Override
    public void process() {

        Config.showAllUsers();
        
    }

}
