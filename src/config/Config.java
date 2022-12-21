package config;

import bean.User;

/**
 *
 * @author ilahe
 */
public class Config {

    private User[] users = new User[0];
    private static Config config;
    private static boolean loggedIn;

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public void appendUser(User u) {
        User[] newUsers = new User[users.length + 1];
        for (int i = 0; i < users.length; i++) {
            newUsers[i] = users[i];
        }
        newUsers[newUsers.length - 1] = u;
        this.users = newUsers;
    }
    
    
    public static void showAllUsers(){
  
        User[] allUsers = Config.getInstance().getUsers();
        for (int i = 0; i < allUsers.length; i++) {
            System.out.println((i+1) + ". " + allUsers[i]);
        }
        
    }

    

}
