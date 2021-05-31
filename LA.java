//BRANDON REYES GARCIA 20110138 3E 
//**********PROYECTO FINAL**********

import javax.swing.*;//todo diseno de ventanas
import java.awt.event.*;//se necesita para disenar eventos
//import java.sql.*;//conecetar base de datos

public class LA extends JFrame implements ActionListener, ItemListener{

 public JLabel laet0;
 public JLabel laet1;
 public JTextField lact1;
 public JTextArea lata1;
 public JTextArea lata2;
 public JButton labt1;
 public JButton labt2;

//inicio constructor 

 public LA(){

  setLayout(null);
  setTitle("Lista Alumnos");
  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   
  laet0 = new JLabel("Lista alumnos");
  laet0.setBounds(100,5,300,15);
  add(laet0);

  laet1 = new JLabel("Ingrese el registro que desea buscar");
  laet1.setBounds(10,30,215,15);
  add(laet1);

  lact1 = new JTextField();
  lact1.setBounds(225,30,100,15);
  add(lact1);

  lata1 = new JTextArea("");
  lata1.setBounds(10,60,230,180);
  lata1.setEditable(false);
  add(lata1);

  lata2 = new JTextArea("");
  lata2.setBounds(250,60,230,180);
  lata2.setEditable(false);
  add(lata2);

  labt1 = new JButton("Buscar");
  labt1.setBounds(30,250,100,30);
  add(labt1);

  labt2 = new JButton("Exit");
  labt2.setBounds(150,250,100,30);
  add(labt2);

  labt1.addActionListener(this);
  labt2.addActionListener(this);

 }// Fin del constructor

 public void actionPerformed(ActionEvent accion){
  if (accion.getSource() == labt2) {JOptionPane.showMessageDialog(null, "Operacion Cancelada");System.exit(0);}
  if (accion.getSource() == labt1) {JOptionPane.showMessageDialog(null, "Datos Registrados Exitosamente");
   
  }
 }//Fin del metodo ActionPerformed

 public void itemStateChanged(ItemEvent accion){
 }// Fin del metodo itemStateChanged

}// Fin de la clase LA