/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author DESAIN WEB
 */
public class Interface_homeController implements Initializable {

    @FXML
    private Label home;
    @FXML
    private Label profile;
    @FXML
    private Label ajukan;
    @FXML
    private Label logout;
    @FXML
    private ScrollPane SuperPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void HomeClicked(MouseEvent event) {
        try{
            //System.out.println(getClass().getResource("interface_home.fxml").getPath());
            home.setBackground(new Background(new BackgroundFill(Color.valueOf("#29B6F6"), CornerRadii.EMPTY, Insets.EMPTY)));
            profile.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
            ajukan.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
            logout.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
            ScrollPane sp = FXMLLoader.load(getClass().getResource("/tutorialjavafx/Home.fxml"));
            SuperPane.setContent(sp);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @FXML
    private void ProfileClicked(MouseEvent event) {
        try{
            home.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
            profile.setBackground(new Background(new BackgroundFill(Color.valueOf("#29B6F6"), CornerRadii.EMPTY, Insets.EMPTY)));
            ajukan.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
            logout.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
            ScrollPane sp = FXMLLoader.load(getClass().getResource("/tutorialjavafx/Profile.fxml"));
            SuperPane.setContent(sp);
        }catch(Exception e){
            System.out.println(e);

        }
        
    }

    @FXML
    private void AjukanAduanClicked(MouseEvent event) {
       try{ 
        home.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        profile.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        ajukan.setBackground(new Background(new BackgroundFill(Color.valueOf("#29B6F6"), CornerRadii.EMPTY, Insets.EMPTY)));
        logout.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        ScrollPane sp = FXMLLoader.load(getClass().getResource("/tutorialjavafx/AjukanAduan.fxml"));
        SuperPane.setContent(sp);
       }catch(Exception e){
            System.out.println(e);
       }
    }

    @FXML
    private void LogoutClicked(MouseEvent event) {
        home.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        profile.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        ajukan.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        logout.setBackground(new Background(new BackgroundFill(Color.valueOf("#29B6F6"), CornerRadii.EMPTY, Insets.EMPTY)));
    }
    
}
