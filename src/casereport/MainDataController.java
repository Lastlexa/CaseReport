/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casereport;

import fxcontrol.FormattedTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import model.Model;

/**
 * FXML Controller class
 *
 * @author Alex
 */
public class MainDataController {
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
    //@Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //System.out.println(("MainDataController"));
    }    

    public FormattedTextField getTextNo(){
        return textNo;
    }

    public FormattedTextField getName(){
        return name;
    }

    public void bind(Model model) {
        if( model.getRecord() != null) {
            textNo.textProperty().bindBidirectional(model.getRecord().noProperty());
            name.textProperty().bindBidirectional(model.getRecord().nameProperty());
            surname.textProperty().bindBidirectional(model.getRecord().surnameProperty());
            patronymic.textProperty().bindBidirectional(model.getRecord().patronymicProperty());
        } 
    }

}
