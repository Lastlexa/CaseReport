/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casereport;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import model.Model;


/**
 * FXML Controller class
 *
 * @author Alex
 */
public class MainWindowController {
    
    @FXML 
    private MainDataController mainDataController;
    /**
     * Initializes the controller class.
     */
   // @Override
    public void initialize(URL url, ResourceBundle rb) {
        //mainDataController = 
    }
    
    public MainDataController getMainDataController() {
        return mainDataController;
    };

    public void bind(Model model) {
        mainDataController.bind(model);
    }
    
}
