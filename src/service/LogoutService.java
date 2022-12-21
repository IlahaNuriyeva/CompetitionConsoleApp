package service;

import service.impl.LogoutServiceImpl;
import util.MenuUtil;

/**
 *
 * @author ilahe
 */
public class LogoutService implements LogoutServiceImpl{

    @Override
    public void process() {
        MenuUtil.showLoginOrRegisterMenu();
    }
    
}
