/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraficoTienda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Adrián
 */
public class MenuVientoController implements Initializable {

    @FXML
    private TextField tf_id;
    @FXML
    private TextField tf_nombre;
    @FXML
    private TextField tf_marca;
    @FXML
    private TextField tf_excitacion;
    @FXML
    private TextField tf_boquilla;
    @FXML
    private TextField tf_precio;
    @FXML
    private Button b_actualizar;
    @FXML
    private Button b_vaciar;
    @FXML
    private Button b_agregar;
    @FXML
    private Button b_eliminar;
    @FXML
    private TableView<?> tv_viento;
    @FXML
    private TableColumn<?, ?> col_id;
    @FXML
    private TableColumn<?, ?> col_nombre;
    @FXML
    private TableColumn<?, ?> col_apellido1;
    @FXML
    private TableColumn<?, ?> col_excitacion;
    @FXML
    private TableColumn<?, ?> col_boquilla;
    @FXML
    private TableColumn<?, ?> col_descrip;
    @FXML
    private Button b_volver;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void actualizarInstrumento(ActionEvent event) {
    }

    @FXML
    private void vaciarFormulario(ActionEvent event) {
    }

    @FXML
    private void agregarInstrumento(ActionEvent event) {
    }

    @FXML
    private void eliminarInstrumento(ActionEvent event) {
    }

    @FXML
    private void volver(ActionEvent event) {
    }
    
}
