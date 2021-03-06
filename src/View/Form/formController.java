package View.Form;

import Controller.ClienteComumController;
import Model.ClienteComum;
import View.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import static View.Scenes.Index;

public class formController {

    public TextField nomeField;
    public TextField emailField;
    public TextField loginField;
    public TextField passwordField;
    public PasswordField confPasswordField;
    public RadioButton rbtPremium;
    public DatePicker DatePick;
    public CheckBox agree;
    public Label lblMsg;

    public ClienteComum cliente;
    public ClienteComumController controllerClienteComum = new ClienteComumController();



    public void ConfirmaCliente(ActionEvent actionEvent) {

        String nome = this.nomeField.getText();
        String email = this.emailField.getText();
        String dataAniv = this.DatePick.getEditor().getText();
        String login = this.loginField.getText();
        String senha = this.confPasswordField.getText();

        String msg = null;
        boolean exception = true;

         if(!rbtPremium.isSelected()){

             if (this.agree.isSelected()){

                 try{

                     cliente = new ClienteComum(nome,email,dataAniv,login,senha,0,0);
                     controllerClienteComum.setCliente(this.cliente);

                 }catch (Exception e){
                     msg = "Uma ou mais informações estão ausentes.";
                     exception = false;
                 }


                 try{


                     controllerClienteComum.cadastrarCliente();

                     System.out.println(controllerClienteComum.getCCHashMap().toString());
                     msg = "Cliente cadastrado com sucesso";

                 }catch (Exception e){

                     if (exception){
                         msg = "Cliente já cadastrado";
                     }
                 }

             }else {
                 msg = "Você deve concordar com os nossos termos";
             }

             lblMsg.setText(msg);

        }




    }

    public  void clearFields(){
        this.nomeField.clear();
        this.emailField.clear();
        this.loginField.clear();
        this.passwordField.clear();
        this.confPasswordField.clear();
        this.DatePick.getEditor().clear();
        this.lblMsg.setText("");
        this.agree.setSelected(false);

    }
    public void toIndex(ActionEvent actionEvent) {


        clearFields();
        Main.changeScreen(Index);


    }
}
