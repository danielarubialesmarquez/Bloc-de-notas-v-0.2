/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import view.View;
import model.Model;
import controllers.Controller;
/**
 *
 * @author Dani
 */
public class Main {
private static Model Model;
    private static View View;
    private static Controller Controller;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model = new Model();
        View = new View();
        Controller = new Controller(Model,View);
    }
    
}
