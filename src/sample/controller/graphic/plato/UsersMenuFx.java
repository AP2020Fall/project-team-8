package sample.controller.graphic.plato;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.model.platoModel.Player;
import sample.model.platoModel.UserShow;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class UsersMenuFx {
    public TableColumn<UserShow, String> userColumn;
    public TableColumn<UserShow, Integer> scoreColumn;
    public TableColumn<UserShow, Integer> daysPassedColumn;
    public TableColumn<UserShow, Integer> winCountColumn;
    public TableView<UserShow> userTable;
    private String gameName;
    ObservableList<UserShow> names = FXCollections.observableArrayList();
    public static ArrayList<UserShow> users =new ArrayList<>();
  //  ListView<Player> listView = new ListView<Player>(names);
    @FXML
    public void initialize() throws IOException {
        makeTree();
    }
    public void makeTree() {
        userColumn.setCellValueFactory(new PropertyValueFactory<UserShow, String>("userName"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<UserShow, Integer>("score"));
        daysPassedColumn.setCellValueFactory(new PropertyValueFactory<UserShow, Integer>("datesPassed"));
        winCountColumn.setCellValueFactory(new PropertyValueFactory<UserShow, Integer>("winsCount"));
        names.clear();
        users.clear();
        list();
        names.addAll(users);
        userTable.setEditable(true);
        userTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        userTable.getSelectionModel().setCellSelectionEnabled(true);
        userTable.setItems(names);
    }

    private  static void list(){
        for (Player player : Player.getAllPlayers()) {
            UserShow userShow=new UserShow(player.getUserName(),player.getDBScore()+player.getReversiScore(), (int) Duration.between(LocalDateTime.now(),player.getPlatoAge()).toDays(),player.getReversiAndWinsCounts()+player.getDotsAndBoxesAndWinsCount());
           userShow.setPlayer(player);
            users.add(userShow);
        }
    }


}