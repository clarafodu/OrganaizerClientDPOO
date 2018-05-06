package Finestra;

import Controller.UserViewController;

import javax.swing.*;
import java.awt.*;

public class Registrarse extends JFrame {



    private JButton jbRegistrarse;
    private JTextField jtfNom;
    private JTextField jtfCorreu;
    private JPasswordField  jpfContrasenya;
    private JPasswordField  jpfContrasenya2;




    public Registrarse() {

        //setTitle("Registre");
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        //setSize(400, 200);

        getContentPane().setLayout(new BorderLayout());


        // Dades del usuari
        JPanel jpDades = new JPanel(new GridLayout(4, 2));
        JLabel jlNom = new JLabel("  Nom usuari: ");
        jtfNom = new JTextField();
        JLabel jlCorreu = new JLabel("  Correu: ");
        jtfCorreu = new JTextField();
        JLabel jlContrasenya = new JLabel("  Contrasenya: ");
        jpfContrasenya = new JPasswordField();
        JLabel jlContrasenya2 = new JLabel("  Confirmació contrasenya: ");
        jpfContrasenya2 = new JPasswordField();
        jpDades.add(jlNom);
        jpDades.add(jtfNom);
        jpDades.add(jlCorreu);
        jpDades.add(jtfCorreu);
        jpDades.add(jlContrasenya);
        jpDades.add(jpfContrasenya);
        jpDades.add(jlContrasenya2);
        jpDades.add(jpfContrasenya2);
        getContentPane().add(jpDades, BorderLayout.CENTER);

        //Boto
        JPanel jpBoto = new JPanel();
        jbRegistrarse = new JButton(" Registrat ");
        jpBoto.add(jbRegistrarse);
        getContentPane().add(jpBoto, BorderLayout.SOUTH);

    }

    public JTextField getJtfNom() {
        return jtfNom;
    }

    public JTextField getJtfCorreu() {
        return jtfCorreu;
    }

    public JPasswordField getJpfContrasenya() {
        return jpfContrasenya;
    }

    public JPasswordField getJpfContrasenya2() {
        return jpfContrasenya2;
    }

    public JButton getJbRegistrarse() {
        return jbRegistrarse;
    }

    public void registerController (UserViewController c){
        jbRegistrarse.setActionCommand("Registrat");
        jbRegistrarse.addActionListener(c);
    }



   /* public static void main(String[] args) {

        Registrarse vista = new Registrarse();
        vista.setVisible(true);
    }*/
}