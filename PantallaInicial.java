package Finestra;

import Controller.UserViewController;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PantallaInicial extends JFrame{

    private JButton jbProjecte;
    private JButton jbEditar;
    private JButton jbEliminar;
    private List listLeft ;
    private List listRigth;
    private ArrayList<Project> projects;

    public PantallaInicial(){

        setTitle("Benvinguts al Organizer");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500,300);

        BorderFactory.createEtchedBorder();
        setLayout(new BorderLayout());
        JPanel jpProjecte= new JPanel(new GridLayout(1,2));

        JPanel jpMeu = new JPanel(new BorderLayout());
        projects= new ArrayList<>();
        Project p= new Project();
        //ScrollPane jspProject = new JScrollPane();
        jpMeu.setBorder(BorderFactory.createTitledBorder("Els meus projectes : "));
        listLeft= new List(projects.size());
        for(Project p: projects){
            if(p.equals())
        }
        listLeft.add();
        listLeft.add("Projecte 2");
        listLeft.add("Projecte 3");
        JPanel jpBotons = new JPanel(new GridLayout(1,2));
        jbEditar= new JButton(" Editar ");
        jbEliminar = new JButton(" Eliminar ");
        jpBotons.add(jbEditar);
        jpBotons.add(jbEliminar);
        jpMeu.add(listLeft);
        //jpMeu.add(jspProject);
        jpMeu.add(jpBotons, BorderLayout.SOUTH);


        JPanel jpCompartit= new JPanel(new BorderLayout());
        jpCompartit.setBorder(BorderFactory.createTitledBorder("Projectes compartits : "));
        listRigth = new List(5);
        jbProjecte= new JButton(" Nou Projecte ");
        listRigth.add("Projecte 1");
        listRigth.add("Projecte 2");
        listRigth.add("Projecte 3");
        listRigth.add("Projecte 1");
        listRigth.add("Projecte 2");
        listRigth.add("Projecte 3");
        listRigth.add("Projecte 1");
        listRigth.add("Projecte 2");
        listRigth.add("Projecte 3");
        listRigth.add("Projecte 1");
        listRigth.add("Projecte 2");
        listRigth.add("Projecte 3");
        listRigth.add("Projecte 1");
        listRigth.add("Projecte 2");
        listRigth.add("Projecte 3");
        listRigth.add("Projecte 1");
        listRigth.add("Projecte 2");
        listRigth.add("Projecte 3");
        listRigth.add("Projecte 1");
        listRigth.add("Projecte 2");
        listRigth.add("Projecte 3");
        jpCompartit.add(listRigth);
        jpCompartit.add(jbProjecte, BorderLayout.SOUTH);

        jpProjecte.add(jpMeu);
        jpProjecte.add(jpCompartit);
        add(jpProjecte);


    }

    public void removeObjectLeft(Project project){

            remove(project);
    }

    public Project seleccionatLeft() {

     return listLeft.getSelected();

    }


    public void addProjectLeft(Project p){
        p = new Project();
        listLeft.add(p.getName());
    }

    public void addProjectRigth(Project p){
        p = new Project();
        listLeft.add(p.getName());
    }

    public List getListLeft() {
        return listLeft;
    }

    public void setListLeft(List listLeft) {
        this.listLeft = listLeft;
    }

    public List getListRigth() {
        return listRigth;
    }

    public void setListRigth(List listRigth) {
        this.listRigth = listRigth;
    }

    public List llistaEsquerra

    public void registerController(UserViewController c){
        jbProjecte.setActionCommand("Nou Projecte");
        jbProjecte.addActionListener(c);
        jbEliminar.setActionCommand("Eliminar Projecte");
        jbEliminar.addActionListener(c);
        jbEditar.setActionCommand("Editar Projecte");
        jbEditar.addActionListener(c);

    }


    public static void main(String[] args) {

        PantallaInicial vista = new PantallaInicial();
        vista.setVisible(true);
    }



}
