//BRANDON REYES GARCIA 20110138 3E 
//**********PROYECTO FINAL**********

import javax.swing.*;//todo diseno de ventanas
import java.awt.event.*;//se necesita para disenar eventos.
import java.sql.*;//conecetar base de datos

public class Menu extends JFrame implements ActionListener{

 public JLabel et0;
 public JButton RA;
 public JButton RP;
 public JButton RM;
 public JButton LA;
 public JButton LP;
 public JButton LM;
 public JButton MA;
 public JButton MP;
 public JButton MM;
 public JButton exit;
 public static Connection cn;

//inicio constructor 

 public Menu(){

  setLayout(null);
  setTitle("Control Escolar");
  setDefaultCloseOperation(EXIT_ON_CLOSE);

  et0 = new JLabel("CONTROL  ESCOLAR  CETI");
  et0.setBounds(30,10,500,15);
  add(et0);

  RA = new JButton("Registro Alumnos");
  RA.setBounds(10,50,200,25);
  add(RA);

  RP = new JButton("Registro Profesores");
  RP.setBounds(10,80,200,25);
  add(RP);

  RM = new JButton("Registro Materias");
  RM.setBounds(10,110,200,25);
  add(RM);

  LA = new JButton("Lista Alumnos");
  LA.setBounds(10,140,200,25);
  add(LA);

  LP = new JButton("Lista Profesores");
  LP.setBounds(10,170,200,25);
  add(LP);

  LM = new JButton("Lista Materias");
  LM.setBounds(10,200,200,25);
  add(LM);

  MA = new JButton("Modificar Alumnos");
  MA.setBounds(10,230,200,25);
  add(MA);

  MP = new JButton("Modificar Profesores");
  MP.setBounds(10,260,200,25);
  add(MP);

  MM = new JButton("Modificar Materias");
  MM.setBounds(10,290,200,25);
  add(MM);

  exit = new JButton("EXIT");
  exit.setBounds(65,340,100,25);
  add(exit);

  RA.addActionListener(this);
  RP.addActionListener(this);
  RM.addActionListener(this);
  LA.addActionListener(this);

 }// Fin del Constructor

  public void actionPerformed(ActionEvent accion){

   if (accion.getSource() == RA){
    RA ventana1 = new RA(cn);
    ventana1.setBounds(200,200,350,350);
    ventana1.setVisible(true);
    ventana1.setResizable(true);     
   }

   if (accion.getSource() == RP){
    RP ventana2 = new RP();
    ventana2.setBounds(200,200,350,260);
    ventana2.setVisible(true);
    ventana2.setResizable(true);     
   }

   if (accion.getSource() == RM){
    RM ventana3 = new RM();
    ventana3.setBounds(200,200,350,200);
    ventana3.setVisible(true);
    ventana3.setResizable(true);     
   }

   if (accion.getSource() == LA){
    LA ventana4 = new LA();
    ventana4.setBounds(200,200,500,350);
    ventana4.setVisible(true);
    ventana4.setResizable(true);     
   }
  
  }// Fin del metodo ActionPerformed

  public static void main (String args[]){

  try { 
   cn = DriverManager.getConnection("jdbc:mysql://localhost/control_escolar","root", "");
   
   JOptionPane.showMessageDialog(null, "DB CONNECTED");
   JOptionPane.showMessageDialog(null, "DB CONNECTED");
   
    Menu ventana = new Menu();
    ventana.setBounds(300,200,240,415);
    ventana.setVisible(true);
    ventana.setResizable(true);

  }
  catch (Exception e) {
   JOptionPane.showMessageDialog(null, "DB NO CONNECTED");}

  }// Fin del main

}// Fin de la clase Menu










