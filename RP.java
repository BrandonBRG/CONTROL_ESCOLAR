//BRANDON REYES GARCIA 20110138 3E 
//**********PROYECTO FINAL**********

import javax.swing.*;//todo diseno de ventanas
import java.awt.event.*;//se necesita para disenar eventos
//import java.sql.*;//conecetar base de datos

public class RP extends JFrame implements ActionListener, ItemListener{

 public JLabel rpet0;
 public JLabel rpet1;
 public JLabel rpet2;
 public JLabel rpet3;
 public JLabel rpet4;
 public JLabel rpet5;
 public JLabel rpet6;
 public JLabel rpet7;
 public JTextField rpct1;
 public JTextField rpct2;
 public JTextField rpct3;
 public JTextField rpct4;
 public JTextField rpct5;
 public JTextField rpct6;
 public JTextField rpct7;
 public JButton rpbt1;
 public JButton rpbt2;

//inicio constructor 

 public RP(){

  setLayout(null);
  setTitle("Registro Profesores");
  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   
  rpet0 = new JLabel("REGISTRO DE PROFESORES");
  rpet0.setBounds(100,5,300,15);
  add(rpet0);

  rpet1 = new JLabel("No. Registro");
  rpet1.setBounds(10,30,120,15);
  add(rpet1);

  rpet2 = new JLabel("Nombre Completo");
  rpet2.setBounds(10,60,120,15);
  add(rpet2);

  rpet3 = new JLabel("Domicilio");
  rpet3.setBounds(10,90,120,15);
  add(rpet3);

  rpet4 = new JLabel("Telefono");
  rpet4.setBounds(10,120,120,15);
  add(rpet4);

  rpet5 = new JLabel("Email");
  rpet5.setBounds(10,150,120,15);
  add(rpet5);

  rpct1 = new JTextField();
  rpct1.setBounds(120,30,200,15);
  add(rpct1);

  rpct2 = new JTextField();
  rpct2.setBounds(120,60,200,15);
  add(rpct2);

  rpct3 = new JTextField();
  rpct3.setBounds(120,90,200,15);
  add(rpct3);

  rpct4 = new JTextField();
  rpct4.setBounds(120,120,200,15);
  add(rpct4);

  rpct5 = new JTextField();
  rpct5.setBounds(120,150,200,15);
  add(rpct5);

  rpbt1 = new JButton("Actualizar");
  rpbt1.setBounds(60,180,100,30);
  add(rpbt1);

  rpbt2 = new JButton("Cancelar");
  rpbt2.setBounds(180,180,100,30);
  add(rpbt2);

  rpbt1.addActionListener(this);
  rpbt2.addActionListener(this);

 }// Fin del constructor

 public void actionPerformed(ActionEvent accion){
  if (accion.getSource() == rpbt2) {JOptionPane.showMessageDialog(null, "Operacion Cancelada");System.exit(0);}
  if (accion.getSource() == rpbt1) {JOptionPane.showMessageDialog(null, "Datos Registrados Exitosamente");
 
  }
 }//Fin del metodo ActionPerformed

 public void itemStateChanged(ItemEvent accion){
 }// Fin del metodo itemStateChanged


}// Fin de la clase RP