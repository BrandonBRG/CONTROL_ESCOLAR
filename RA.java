//BRANDON REYES GARCIA 20110138 3E 
//**********PROYECTO FINAL**********

import javax.swing.*;//todo diseno de ventanas
import java.awt.event.*;//se necesita para disenar eventos
import java.sql.*;//conecetar base de datos

public class RA extends JFrame implements ActionListener, ItemListener{
 
 public JLabel raet0;
 public JLabel raet1;
 public JLabel raet2;
 public JLabel raet3;
 public JLabel raet4;
 public JLabel raet5;
 public JLabel raet6;
 public JLabel raet7;
 public JTextField ract1;
 public JTextField ract2;
 public JTextField ract3;
 public JTextField ract4;
 public JTextField ract5;
 public JTextField ract6;
 public JTextField ract7;
 public JButton rabt1;
 public JButton rabt2;
 public JComboBox <String> racb1;
 public static Connection _cn;
 public String grado;

//inicio constructor 

 public RA(Connection cn){

 _cn = cn;

  setLayout(null);
  setTitle("Registro Alumnos");
  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   
  raet0 = new JLabel("REGISTRO DE ALUMOS");
  raet0.setBounds(100,5,300,15);
  add(raet0);

  raet1 = new JLabel("No. Registro");
  raet1.setBounds(10,30,120,15);
  add(raet1);

  raet2 = new JLabel("Nombre Completo");
  raet2.setBounds(10,60,120,15);
  add(raet2);

  raet3 = new JLabel("Domicilio");
  raet3.setBounds(10,90,120,15);
  add(raet3);

  raet4 = new JLabel("Telefono");
  raet4.setBounds(10,120,120,15);
  add(raet4);

  raet5 = new JLabel("Email");
  raet5.setBounds(10,150,120,15);
  add(raet5);

  raet6 = new JLabel("Grado");
  raet6.setBounds(10,180,120,15);
  add(raet6);

  raet7 = new JLabel("Calificacion");
  raet7.setBounds(10,210,120,15);
  add(raet7);

  ract1 = new JTextField();
  ract1.setBounds(120,30,200,15);
  add(ract1);

  ract2 = new JTextField();
  ract2.setBounds(120,60,200,15);
  add(ract2);

  ract3 = new JTextField();
  ract3.setBounds(120,90,200,15);
  add(ract3);

  ract4 = new JTextField();
  ract4.setBounds(120,120,200,15);
  add(ract4);

  ract5 = new JTextField();
  ract5.setBounds(120,150,200,15);
  add(ract5);

  racb1 = new JComboBox <String> ();
  racb1.setBounds(120,180,200,20);
  add(racb1);

  ract7 = new JTextField();
  ract7.setBounds(120,210,200,15);
  add(ract7);

  rabt1 = new JButton("Actualizar");
  rabt1.setBounds(30,250,100,30);
  add(rabt1);

  rabt2 = new JButton("Cancelar");
  rabt2.setBounds(150,250,100,30);
  add(rabt2);

  racb1.addItem("Primero");
  racb1.addItem("Segundo");
  racb1.addItem("Tercero");
  racb1.addItem("Cuarto");
  racb1.addItem("Quinto");
  racb1.addItem("Sexto");
  racb1.addItem("Septimo");
  racb1.addItem("Octavo");

  rabt1.addActionListener(this);
  rabt2.addActionListener(this);

 }// Fin del constructor

 public void actionPerformed(ActionEvent accion){
  if (accion.getSource() == rabt2) {JOptionPane.showMessageDialog(null, "Operacion Cancelada");System.exit(0);}
  if (accion.getSource() == rabt1) {

  JOptionPane.showMessageDialog(null, "Datos Registrados Exitosamente");
   
   try {
     String AccionSQL = "INSERT INTO alumnos (Registro,Nombre,Domicilio,Telefono,Email,Grado,Calificacion)"; 
     AccionSQL += " VALUES ('" + ract1.getText() + "','" + ract2.getText() + "','" + ract3.getText() + "','" + ract4.getText() + "";
     AccionSQL += "','" + ract5.getText() + "','" + grado + "','" + ract7.getText() + "')";

     PreparedStatement query = _cn.prepareStatement(AccionSQL);
     query.executeUpdate();

   }
   catch (Exception ex){
     JOptionPane.showMessageDialog(null, "No Funciono :( " +ex.toString());
   }

  }//Fin del if

 }//Fin del metodo ActionPerformed

 public void itemStateChanged(ItemEvent accion){

    grado = racb1.getSelectedItem().toString();

 }// Fin del metodo itemStateChanged


}// Fin de la clase RA