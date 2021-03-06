package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import sample.Main;
import sample.model.platoModel.*;
import sample.view.Client;


import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class EventsLogFx {
    public TableColumn<sample.model.platoModel.Event, String> idColumn;
    public TableColumn<sample.model.platoModel.Event, LocalDateTime> gameColumn;
    public TableColumn<sample.model.platoModel.Event, LocalDateTime> startColumn;
    public TableColumn<sample.model.platoModel.Event, Integer> endColumn;
    public TableColumn<sample.model.platoModel.Event, String> scoreColumn;
    public TableView<sample.model.platoModel.Event> EventsTable;
    ObservableList<sample.model.platoModel.Event> eventsObserve = FXCollections.observableArrayList();
    public static ArrayList<sample.model.platoModel.Event> eventsShow =new ArrayList<>();
    private static Parent pre;

    public static void setPre(Parent pre) {
        EventsLogFx.pre = pre;
    }

    public void loadEvent(ActionEvent actionEvent) throws IOException {
        try {
            Client.dos.writeUTF("loadEvent,"+EventsTable.getSelectionModel().getSelectedItem().getEventId());
            // myWriter.close();
            System.out.println(" loadEv Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        sample.model.platoModel.Event event=EventsTable.getSelectionModel().getSelectedItem();
      //  EventFx.setEvent(event);
        EventFx.setPre(FXMLLoader.load(getClass().getResource("/sample/view/eventsLog.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/eventFx.fxml"));
     //   Parent root = FXMLLoader.load(Objects.requireNonNull(EventFx.class.getClassLoader().getResource("eventFx.fxml")));
        Scene pageTwoScene = new Scene(root);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
    @FXML
    public void initialize() throws IOException {
        makeTree();
    }
    public void makeTree() {
        idColumn.setCellValueFactory(new PropertyValueFactory<sample.model.platoModel.Event, String>("eventId"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<sample.model.platoModel.Event, String>("gameName"));
        gameColumn.setCellValueFactory(new PropertyValueFactory<sample.model.platoModel.Event, LocalDateTime>("startOfGame"));
        startColumn.setCellValueFactory(new PropertyValueFactory<sample.model.platoModel.Event, LocalDateTime>("endOfGame"));
        endColumn.setCellValueFactory(new PropertyValueFactory<sample.model.platoModel.Event, Integer>("eventScore"));
        eventsObserve.clear();
        eventsShow.clear();
        list();
        eventsObserve.addAll(eventsShow);
        EventsTable.setEditable(true);
        EventsTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        EventsTable.getSelectionModel().setCellSelectionEnabled(true);
        EventsTable.setItems(eventsObserve);

    }

    public   static void list(){
        eventsShow.addAll(Event.getAllEvents());
    }

    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void processBack(MouseEvent mouseEvent) {
        Scene pageTwoScene = new Scene(pre);
        Main.allStage.setScene(pageTwoScene);
        Main.allStage.show();
    }
}
