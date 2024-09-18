/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.view.ItemView;
import edu.ijse.mvc.view.OrderView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anjan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ItemView itemView = new ItemView();
//        itemView.setLocationRelativeTo(null);
//        itemView.setVisible(true);
        new OrderView().setVisible(true);

    }
    
}
