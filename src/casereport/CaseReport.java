/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casereport;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.CaseRecord;

/**
 *
 * @author Alex
 */
public class CaseReport extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setMinHeight(480);
        stage.setMinWidth(640);
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.setTitle("Выписка из истории болезни");
        
        stage.show();
        
        CaseRecord record = new CaseRecord("1", "A", "B", "C");
        
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
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}