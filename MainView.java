package Finestra;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    private IniciaSessio iniciaSessio;
    private Registrarse registrarse;

    private CardLayout layout;

    public MainView(){
        layout = new CardLayout();
        this.iniciaSessio= new IniciaSessio();
        this.registrarse= new Registrarse();
        this.getContentPane().setLayout(layout);
        this.getContentPane().add("Iniciar Sessio",iniciaSessio);
        this.getContentPane().add("Registrar", registrarse);
        this.setSize(500,500);
        this.setResizable(false);
        this.setTitle("Organizer");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
