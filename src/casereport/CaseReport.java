/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casereport;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.CaseRecord;
import model.Model;

/**
 *
 * @author Alex
 */
public class CaseReport extends Application {
    
    StringProperty text = new SimpleStringProperty("1123");
    
    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        
        stage.setMinHeight(480);
        stage.setMinWidth(640);
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.setTitle("Выписка из истории болезни");
        
        stage.show();
        
        Model model = new Model();
        model.loadDict();
	model.setRecord(new CaseRecord("123456", "Иванов", "Петр", "Семеныч"));
        
        MainWindowController mainController = loader.getController();
        mainController.bind(model);
                
        //mainController.getMainDataController().getTextNo().textProperty().bindBidirectional(this.text);
        //mainController.getMainDataController().getName().textProperty().bindBidirectional(this.text);
        
        //Node node = scene.lookup("#textNo");
        //System.out.println(node);
        /*
        System.out.println( 
            ((Parent)
                ((Parent)
                    ((Parent)
                        ((Parent) root.getChildrenUnmodifiable().get(1)
                        ).getChildrenUnmodifiable().get(0) 
                    ).getChildrenUnmodifiable().get(0)
                ).getChildrenUnmodifiable().get(0)
            ).getChildrenUnmodifiable().size()
        );
        */
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
