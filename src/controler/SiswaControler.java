/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;
import tutorialjavafx.koneksi;

/**
 * FXML Controller class
 *
 * @author RPL
 */
public class SiswaControler implements Initializable {

    @FXML
    private ScrollPane SuperPane;
    @FXML
    private TextField nis;
    @FXML
    private TextField nama;
    @FXML
    private TextArea alamat;
    @FXML
    private Button btnSimpan;
    @FXML
    private ToggleGroup jk;    
    @FXML
    private RadioButton radio_lk;    
    @FXML
    private RadioButton radio_pr;
    @FXML
    private ComboBox<String> combo_agama;
    ObservableList<String> list = FXCollections.observableArrayList("Islam","Kristen","Protestan","Hindu","Budha","Lainnya");
    private String jenis_kelamin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        combo_agama.setItems(list);
    }    

    @FXML
    private void klikSimpan(MouseEvent event) {
        Connection conn = koneksi.koneksi();
        PreparedStatement pst;
        try{
            String sql = "INSERT INTO tb_siswa (nis, nama, agama, gender, alamat) VALUES (?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, nis.getText());
            pst.setString(2, nama.getText());
            pst.setString(3, combo_agama.getValue());
            pst.setString(4, jenis_kelamin);
            pst.setString(5, alamat.getText());
            pst.execute();
            nis.setText("");
            nama.setText("");
            combo_agama.setValue("");
            jenis_kelamin = "";
            alamat.setText("");
            JOptionPane.showMessageDialog(null, "Berhasil menambah data!");          

            
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    @FXML
    private void action_lk(ActionEvent event) {
        jenis_kelamin = radio_lk.getText();
    }

    @FXML
    private void action_pr(ActionEvent event) {
        jenis_kelamin = radio_pr.getText(); 

    }
    
}
