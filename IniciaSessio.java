package Finestra;

import Controller.UserViewController;

import javax.swing.*;
import java.awt.*;

public class IniciaSessio extends JFrame{

    private JButton jbRegistarse;
    private JButton jbIS;
    private JTextField jtfNom;
    private JPasswordField jpfPassword;



    public IniciaSessio(){

        //setTitle("Benvinguts al Organizer");
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        //setSize(400,360);
        setLayout(new GridLayout(2,1));
        JPanel jptotal= new JPanel(new BorderLayout());

        /** Foto north pantalla */

        ImageIcon image = new ImageIcon("logo.png");
        JLabel imageLabel = new JLabel(image);
        add(imageLabel, BorderLayout.NORTH);


        /** Registre / Inici sessió */

        JPanel jpPantalla = new JPanel(new GridLayout(2,2));
        JPanel jpSouth= new JPanel( new GridLayout(1,2));
        JLabel jlNom= new JLabel("Nom usuari\no\ncorreu: ");
        jtfNom = new JTextField();
        JLabel jlPassword = new JLabel("Contrasenya: ");
        jpfPassword= new JPasswordField();
        jbRegistarse = new JButton("Registrar-se");
        jbIS = new JButton("Inicia Sessió");

        jpPantalla.add(jlNom);
        jpPantalla.add(jtfNom);
        jpPantalla.add(jlPassword);
        jpPantalla.add(jpfPassword);
        jpSouth.add(jbRegistarse);
        jpSouth.add(jbIS);

        jptotal.add(jpPantalla, BorderLayout.CENTER);
        jptotal.add(jpSouth, BorderLayout.SOUTH);



        getContentPane().add(jptotal);

    }

    /** Recupera el nom de la tasca a inserir */

    public JTextField getJtfNom() {
        return jtfNom;
    }

    /** Recupera la contrasenya de la tasca a inserir */

    public JPasswordField getJpfPassword() {
        return jpfPassword;
    }

    /** Netejar les caixes de text per la introducció de tasques */

    public void cleanFields(){
        jtfNom.setText("");
        jpfPassword.setText("");
    }

    public void registerController(UserViewController c){
        jbIS.setActionCommand("Iniciar Sessio");
        jbIS.addActionListener(c);
        jbRegistarse.setActionCommand("Registrar");
        jbRegistarse.addActionListener(c);
    }

   /* public static void main(String[] args) {

        IniciaSessio vista = new IniciaSessio();
        vista.setVisible(true);
    }*/
}
