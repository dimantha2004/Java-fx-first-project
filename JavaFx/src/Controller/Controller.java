package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import customer.customer;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Observable;

public class Controller {
    public TextField name;
    public TextField address;
    public TextField age;
    public TextField salary;
    public TableView table;
    public TableColumn colname;
    public TableColumn colage;
    public TableColumn coladdress;
    public TableColumn colsalary;

    ArrayList<customer> customerlist =new ArrayList<>();
    public void btnaddnaction(ActionEvent actionEvent) {
        String txtname= name.getText();
        String txtage= age.getText();
        String txtaddress= address.getText();
        Double txtsalary= Double.parseDouble(salary.getText());

        customer c1=new customer(txtname,txtage,txtaddress,txtsalary);

        customerlist.add(c1);
        System.out.println(customerlist);
    }

    public void btnshowonaction(ActionEvent actionEvent) {
        LoadTable();
    }

    private void LoadTable(){
        ObservableList<customer>customerObservableList= FXCollections.observableArrayList();
        colname.setCellValueFactory(new PropertyValueFactory<>("name"));
        coladdress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colage.setCellValueFactory(new PropertyValueFactory<>("age"));
        colsalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        customerlist.forEach(obj-> {
            customerObservableList.add(obj);
        });
        table.setItems(customerObservableList);
    }

}
