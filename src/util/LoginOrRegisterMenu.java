package util;

import service.LoginService;
import service.MenuService;
import service.RegisterService;

/**
 *
 * @author ilahe
 */
public enum LoginOrRegisterMenu implements Menu {

    LOGIN(1, "Login", new LoginService()),
    REGISTER(2, "Register", new RegisterService()),
    UNKNOWN;

    private String label;
    private int number;
    private MenuService service;

    LoginOrRegisterMenu(int number, String label, MenuService service) {
        this.label = label;
        this.number = number;
        this.service = service;
    }

    private LoginOrRegisterMenu() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MenuService getService() {
        return service;
    }

    public void setService(MenuService service) {
        this.service = service;
    }
    
    

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return number + ". " + label;
    }

    @Override
    public void process() {
        service.process();
        MenuUtil.showOperationMenu();
    }

    public static void showLoginOrRegisterMenu() {

        LoginOrRegisterMenu[] menu = LoginOrRegisterMenu.values();
        for (int i = 0; i < menu.length; i++) {
            if ((menu[i] != UNKNOWN)) {
                System.out.println(menu[i]);
            }
        }
    }

    public static LoginOrRegisterMenu find(int number) {
        LoginOrRegisterMenu[] menu = LoginOrRegisterMenu.values();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].getNumber() == number) {
                return menu[i];
            }
        }
        return UNKNOWN;
    }

}
