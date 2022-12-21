package util;

import service.ExitService;
import service.LogoutService;
import service.MenuService;
import service.RegisterService;
import service.ShowUsersService;
import service.StartCompetitionService;

/**
 *
 * @author ilahe
 */
public enum OperationMenu implements Menu{
    
    Register_Contestant(1,"Register contestants", new RegisterService()), 
    Show_User(2,"Show all users", new ShowUsersService()),
    Start_Competition(3, "Start the competition", new StartCompetitionService()), 
    Logout(4, "Log out", new LogoutService()), 
    Exit(5, "Exit", new ExitService()),    
    UNKNOWN;

    private String label;
    private int number;
    private MenuService service;

    OperationMenu(int number, String label, MenuService service) {
        this.label = label;
        this.number = number;
        this.service = service;
    }

    OperationMenu() {
        
    }

    @Override
    public String toString() {
        return number + ". " +label;
    }
    
    @Override
    public void process(){
        service.process();
        MenuUtil.showOperationMenu();
    }
    
    public static void showAllMenu(){
        OperationMenu[] menu = OperationMenu.values();
        
        for (int i = 0; i < menu.length; i++) {
            if(menu[i] != UNKNOWN){
            System.out.println(menu[i]);
            }
        }
    }
    
    
    public static OperationMenu find(int number){
        OperationMenu[] menu = OperationMenu.values();
        for (int i = 0; i < menu.length; i++) {
            if(menu[i].getNumber() == number ){
                return menu[i];
            }
        }
        return UNKNOWN;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
    
    
    
    
    
    
}
