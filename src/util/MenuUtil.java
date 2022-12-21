/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author ilahe
 */
public class MenuUtil {

    public static void showLoginOrRegisterMenu() {
        LoginOrRegisterMenu.showLoginOrRegisterMenu();
        Scanner sc = new Scanner(System.in);
        int selectedNumber = sc.nextInt();
        LoginOrRegisterMenu selectedMenu = LoginOrRegisterMenu.find(selectedNumber);
        selectedMenu.process();
    }

    public static void showOperationMenu() {
        OperationMenu.showAllMenu();
        Scanner sc = new Scanner(System.in);
        int selectedNumber = sc.nextInt();
        OperationMenu selectedMenu = OperationMenu.find(selectedNumber);
        selectedMenu.process();
    }

    public static void showMenu() {
        OperationMenu.showAllMenu();
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }

}
