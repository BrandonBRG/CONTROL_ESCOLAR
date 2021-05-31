//BRANDON REYES GARCIA 20110138 3E 
//**********PROYECTO FINAL**********

import javax.swing.*;//todo diseno de ventanas
import java.awt.event.*;//se necesita para disenar eventos
//import java.sql.*;//conecetar base de datos

public class RM extends JFrame implements ActionListener, ItemListener{

 public JLabel rmet0;
 public JLabel rmet1;
 public JLabel rmet2;
 public JTextField rmct1;
 public JTextField rmct2;
 public JButton rmbt1;
 public JButton rmbt2;
 public JComboBox <String> rmcb1;

//inicio constructor 

 public RM(){

  setLayout(null);
  setTitle("Registro Materias");
  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   
  rmet0 = new JLabel("REGISTRO DE MATERIAS");
  rmet0.setBounds(100,5,300,15);
  add(rmet0);

  rmet1 = new JLabel("Nombre");
  rmet1.setBounds(10,30,120,15);
  add(rmet1);

  rmet2 = new JLabel("GRADO");
  rmet2.setBounds(10,60,120,15);
  add(rmet2);

  rmct1 = new JTextField();
  rmct1.setBounds(120,30,200,15);
  add(rmct1);

  rmcb1 = new JComboBox <String> ();
  rmcb1.setBounds(120,60,200,20);
  add(rmcb1);

  rmbt1 = new JButton("Actualizar");
  rmbt1.setBounds(60,100,100,30);
  add(rmbt1);

  rmbt2 = new JButton("Cancelar");
  rmbt2.setBounds(180,100,100,30);
  add(rmbt2);

  rmcb1.addItem("Primero");
  rmcb1.addItem("Segundo");
  rmcb1.addItem("Tercero");
  rmcb1.addItem("Cuarto");
  rmcb1.addItem("Quinto");
  rmcb1.addItem("Sexto");
  rmcb1.addItem("Septimo");
  rmcb1.addItem("Octavo");

  rmbt1.addActionListener(this);
  rmbt2.addActionListener(this);

 }// Fin del constructor

 public void actionPerformed(ActionEvent accion){
  if (accion.getSource() == rmbt2) {JOptionPane.showMessageDialog(null, "Operacion Cancelada");System.exit(0);}
  if (accion.getSource() == rmbt1) {JOptionPane.showMessageDialog(null, "Datos Registrados Exitosamente");
 
  }
 }//Fin del metodo ActionPerformed

 public void itemStateChanged(ItemEvent accion){
 }// Fin del metodo itemStateChanged


}// Fin de la clase RP