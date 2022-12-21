/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ilahe
 */
public class ExitService implements MenuService{
    
    @Override
    public void process() {
         System.exit(0);
    }
}
