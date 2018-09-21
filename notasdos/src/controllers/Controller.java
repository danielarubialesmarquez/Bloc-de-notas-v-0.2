/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import model.Model;
import view.View;
/**
 *
 * @author Dani
 */
public class Controller implements ActionListener{
 private final Model ModelADTexto;
    private final View View;
 
    public Controller(Model Model, View View){
        this.ModelADTexto = Model;
        this.View = View;
        View.jmi_abrir.addActionListener(this);
        View.jmi_guardar.addActionListener(this);
        initView();
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==View.jmi_abrir){      
            JFileChooser file=new JFileChooser();
        file.showSaveDialog(null);
        file.showOpenDialog(null);
        ModelADTexto.setPath(""+file.getSelectedFile());
            View.jta_texto.setText(ModelADTexto.getMessage());
        }else if(e.getSource()==View.jmi_guardar){
            ModelADTexto.setMessage(View.jta_texto.getText());
        }
    }
    private void initView() {
        View.setTitle("Notas número dos ");
        View.setResizable(false);
        View.setLocationRelativeTo(null);
        View.setVisible(true);
    } 
     
}
