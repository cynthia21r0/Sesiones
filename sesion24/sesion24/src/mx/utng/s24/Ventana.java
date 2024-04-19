package mx.utng.s24;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt. event.ActionListener;

//Declaramos una clase que servira de ventana
public class Ventana extends JFrame{
    private JTextField txtUsuario;
    private JPasswordField txtClave;

    public Ventana(){
        //Invocanso al constructor de la clase padre (superclase)
        super("Autenticacion de usuario");
        //Dimensiones de la ventana
        setSize(300, 200);
        //Cuando de clic en el boton X se cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Coloco un contenedor de componentes GUI
        JPanel panel = new JPanel(new GridBagLayout());
        //Coloco restricciones para la rejila
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        //Etiquetas para los campos
        JLabel lblUsuario = new JLabel("Usuario: ");
        JLabel lblClave = new JLabel("Clave: ");

        //Inicio caja de texto
        txtUsuario = new JTextField(15);
        txtClave = new JPasswordField(15);

        //Boton de login
        JButton btnLogin = new JButton("Login");
        //La accion del boton
        btnLogin.addActionListener(
            new ActionListener(){
                public void actionPerfomed(ActionEvent e){
                    System.out.println("Funciona");
                };
            }
        );

        //Colocando celda
        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(lblUsuario, gbc);



        panel.add(lblUsuario, gbc);

        this.add(panel);




        //Hace visible la ventana por defecto esta en false
        setVisible(true);


    }

    public static void main(String[] args) {
        new Ventana();
    }

}