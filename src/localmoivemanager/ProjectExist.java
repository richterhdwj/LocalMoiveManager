/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package localmoivemanager;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author hdwjy
 */
public class ProjectExist {
    public ProjectExist(Parent root){
        for(Node node:root.getChildrenUnmodifiable()){
            if(node.getId().equals("")){
                
            }
        }
    }
}
