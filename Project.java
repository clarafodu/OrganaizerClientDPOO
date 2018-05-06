package Finestra;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Callback;

import javax.swing.*;
import java.awt.*;

public class Project extends JFrame{

    private int columnes;
    private JButton jbAfegir;
    private String name;
    private int price;

    public Project(){

        setTitle("Project");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500,300);
        setLayout(new BorderLayout());


        JScrollPane jspTotal = new JScrollPane();
        jspTotal.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);



        ObservableList<CustomThing> data = FXCollections.observableArrayList();
        data.addAll(new CustomThing("Cheese", 123), new CustomThing("Horse", 456), new CustomThing("Jam", 789));

        ListView<CustomThing> listView = new ListView<CustomThing>(data);
        listView.setCellFactory(new Callback<ListView<CustomThing>, ListCell<CustomThing>>() {
            public ListCell<CustomThing> call(ListView<CustomThing> arg0) {
                return new ListCell<CustomThing>() {

                    @Override
                    protected void updateItem(CustomThing item, boolean bln) {
                        super.updateItem(item, bln);
                        if (item != null) {
                            VBox vBox = new VBox(new Text(item.getName()), new Text(String.format("%d $", item.getPrice())));
                            //Label graphic= new Label("[Graphic]");
                            HBox hBox = new HBox(vBox);
                            hBox.setSpacing(10);
                            setGraphic(hBox);
                        }
                    }

                };
            }

        });

        JPanel jpView= new JPanel(new GridLayout(1,4));
        JScrollPane jspColumna= new JScrollPane();
        jspColumna.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jbAfegir= new JButton("Afegir tasca");
        jpView.add(listView);
        jpView.add(jbAfegir);
        jpView.add(jspColumna);

    }



        //Finestretes de tasques internes



    public static void main(String[] args) {

        //CustomListView c= new CustomListView();
        Project vista = new Project();
        vista.setVisible(true);
        //c.setVisible(true);
    }

}

