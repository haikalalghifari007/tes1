/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package medclickdemodisplay;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author lphai
 */
public class MainController implements Initializable {
    ObservableList data = observableArrayList();
    
    @FXML
    private Button btnDaftar;

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnPasien;

    @FXML
    private Button btnRekamMedis;

    @FXML
    private Button btnTindakan;

    @FXML
    private Label lbStatus;
    
    @FXML
    private TextField tfNama;
    
    @FXML
    private TextField tfNIK;
    
    @FXML
    private TextField tfNOtelp;
    
    @FXML
    private TextField tfTempatLahir;
    
    @FXML
    private DatePicker tfTanggalLahir;
    
    @FXML
    private TextField tfPekerjaan;
    
    @FXML
    private TextField tfAlamat;
    
    @FXML
    private RadioButton rbLakilaki;
    
    @FXML
    private RadioButton rbPerempuan;
    
    @FXML
    private TableColumn tcNama;
    
    @FXML
    private TableColumn tcNIK;
    
    @FXML
    private TableColumn tcNOtelp;
    
    @FXML
    private TableColumn tcTempatLahir;
    
    @FXML
    private TableColumn tcTanggalLahir;
    
    @FXML
    private TableColumn tcPekerjaan;
    
    @FXML
    private TableColumn tcAlamat;
    
    @FXML
    private TableColumn tcKelamin;
    
    @FXML
    private TableColumn tcNomor;
    
    @FXML
    private TableColumn tcRekamMedis;
    
    @FXML
    private TableColumn tcHapus;
    
    @FXML
    private TableColumn tcUbah;
    
    @FXML
    private ChoiceBox cbGoldar;
    
    @FXML
    private TableView tableView;
    
    @FXML
    private GridPane gpDaftar;

    @FXML
    private GridPane gpDashboard;

    @FXML
    private GridPane gpData;
    
    @FXML
    private StackPane spAll;
    
    @FXML
    private Pane pnDaftar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        spAll.setId("stack-pane");
        gpData.getStyleClass().add("grid-pane");
        gpDashboard.getStyleClass().add("grid-pane");
        gpDaftar.getStyleClass().add("grid-pane");
        pnDaftar.getStyleClass().add("pane");
        gpDashboard.toFront();
        cbGoldar.getItems().addAll("A", "B", "AB", "O");
        tcNama.setCellValueFactory(new PropertyValueFactory<DataPasien, String>("Nama"));
        tcNIK.setCellValueFactory(new PropertyValueFactory<DataPasien, String>("NIK"));
        tcTanggalLahir.setCellValueFactory(new PropertyValueFactory<DataPasien, LocalDate>("Tanggal"));
        tcTempatLahir.setCellValueFactory(new PropertyValueFactory<DataPasien, String>("Tempat"));
        tcAlamat.setCellValueFactory(new PropertyValueFactory<DataPasien, String>("Alamat"));
        tcPekerjaan.setCellValueFactory(new PropertyValueFactory<DataPasien, String>("Pekerjaan"));
        tcNOtelp.setCellValueFactory(new PropertyValueFactory<DataPasien, String>("NoHP"));
        tcKelamin.setCellValueFactory(new PropertyValueFactory<DataPasien, String>("Kelamin"));
        tcRekamMedis.setCellValueFactory(new PropertyValueFactory<DataPasien, String>("rekammedis"));
        tcUbah.setCellValueFactory(new PropertyValueFactory<DataPasien, String>("Goldar"));
        tableView.setItems(data);
        tableView.setEditable(true);
        editableCols();
    }
  
    private void editableCols(){
        tcNama.setCellFactory(TextFieldTableCell.forTableColumn());
        tcNama.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<DataPasien, String>>(){
            @Override
            public void handle(TableColumn.CellEditEvent<DataPasien, String> event){
                DataPasien dataPasien = event.getRowValue();
                dataPasien.setNama(event.getNewValue());
            }
        });
        
        tcNIK.setCellFactory(TextFieldTableCell.forTableColumn());
        tcNIK.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<DataPasien, String>>(){
            @Override
            public void handle(TableColumn.CellEditEvent<DataPasien, String> event){
                DataPasien dataPasien = event.getRowValue();
                dataPasien.setNIK(event.getNewValue());
            }
        });
        
        tcTempatLahir.setCellFactory(TextFieldTableCell.forTableColumn());
        tcTempatLahir.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<DataPasien, String>>(){
            @Override
            public void handle(TableColumn.CellEditEvent<DataPasien, String> event){
                DataPasien dataPasien = event.getRowValue();
                dataPasien.setTempat(event.getNewValue());
            }
        });
        
        tcAlamat.setCellFactory(TextFieldTableCell.forTableColumn());
        tcAlamat.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<DataPasien, String>>(){
            @Override
            public void handle(TableColumn.CellEditEvent<DataPasien, String> event){
                DataPasien dataPasien = event.getRowValue();
                dataPasien.setAlamat(event.getNewValue());
            }
        });
        
        tcPekerjaan.setCellFactory(TextFieldTableCell.forTableColumn());
        tcPekerjaan.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<DataPasien, String>>(){
            @Override
            public void handle(TableColumn.CellEditEvent<DataPasien, String> event){
                DataPasien dataPasien = event.getRowValue();
                dataPasien.setPekerjaan(event.getNewValue());
            }
        });
        
        tcNOtelp.setCellFactory(TextFieldTableCell.forTableColumn());
        tcNOtelp.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<DataPasien, String>>(){
            @Override
            public void handle(TableColumn.CellEditEvent<DataPasien, String> event){
                DataPasien dataPasien = event.getRowValue();
                dataPasien.setTempat(event.getNewValue());
            }
        });
        
        tcKelamin.setCellFactory(TextFieldTableCell.forTableColumn());
        tcKelamin.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<DataPasien, String>>(){
            @Override
            public void handle(TableColumn.CellEditEvent<DataPasien, String> event){
                DataPasien dataPasien = event.getRowValue();
                dataPasien.setKelamin(event.getNewValue());
            }
        });
        tcUbah.setCellFactory(TextFieldTableCell.forTableColumn());
        tcUbah.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<DataPasien, String>>(){
            @Override
            public void handle(TableColumn.CellEditEvent<DataPasien, String> event){
                DataPasien dataPasien = event.getRowValue();
                dataPasien.setGoldar(event.getNewValue());
            }
        });
    }
    
    @FXML
    private void deleteData(ActionEvent event){
        int selectedID = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedID);
    }

    @FXML
    public void handleClicks(ActionEvent event){
        if (event.getSource() == btnDashboard){
            lbStatus.setText("Dashboard");
            gpDashboard.toFront();
        }else if (event.getSource() == btnDaftar){
            lbStatus.setText("Daftar Pasien");
            gpDaftar.toFront();
        }else if (event.getSource() == btnTindakan){
            lbStatus.setText("Tindakan");
        }else if (event.getSource() == btnPasien){
            lbStatus.setText("Data Pasien");
            gpData.toFront();
        }else if (event.getSource() == btnRekamMedis){
            lbStatus.setText("Rekam Medis");
        }
        
    }

    @FXML
    private void tambahPasienAction(ActionEvent event) {   
        String nama = tfNama.getText();
        String nIK = tfNIK.getText();
        LocalDate tanggal = tfTanggalLahir.getValue();
        String tempat = tfTempatLahir.getText();
        String pekerjaan = tfPekerjaan.getText();
        String alamat = tfAlamat.getText();
        String noHP = tfNOtelp.getText();
        String kelamin = null;
        String goldar = null;
        if(rbLakilaki.isSelected()) kelamin = "L";
        else if(rbPerempuan.isSelected()) kelamin = "P";
        if(cbGoldar.getValue().equals("A")) goldar = "A";
        if(cbGoldar.getValue().equals("B")) goldar = "B";
        if(cbGoldar.getValue().equals("AB")) goldar = "AB";
        if(cbGoldar.getValue().equals("O")) goldar = "O";
        data.add(new DataPasien(nama, nIK, tanggal, tempat, pekerjaan, alamat, noHP, kelamin, goldar));
        tfNama.setText("");  
        tfNIK.setText("");
        tfNOtelp.setText("");
        tfTempatLahir.setText("");
        tfTanggalLahir.setValue(null);
        tfPekerjaan.setText("");
        tfAlamat.setText("");
        rbLakilaki.setSelected(false);
        rbPerempuan.setSelected(false);
        cbGoldar.setValue(null);
    }    
    
}
