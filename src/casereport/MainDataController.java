/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casereport;

import fxcontrol.FormattedTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Alex
 */
public class MainDataController implements Initializable {
    @FXML
    private FormattedTextField textNo;
    @FXML
    private FormattedTextField name;
    @FXML
    private FormattedTextField patronymic;
    @FXML
    private FormattedTextField surname;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println(("MainDataController"));
    }    

    
}
