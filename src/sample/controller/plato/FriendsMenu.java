package sample.controller.plato;

import sample.controller.graphic.plato.FirstMenuFx;
import sample.model.platoModel.Player;

import java.util.Objects;

public class FriendsMenu {
     private static Player player=FirstMenuFx.getLoggedInPlayer();
   /* public void showFriends(){
        player.getFriends().toString();
    }*/
   /* public void showFriendReq(){
        player.getFriendRequest().toString();
    }*/
   public static String output;

    public static void setPlayer(Player player) {
        FriendsMenu.player = player;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void processRemoveFriend(String friendId){
        Player.getPlayerWithUser(friendId).getFriends().remove(player);
        player.getFriends().remove(Player.getPlayerWithUser(friendId));
    }
    public static void processAcceptUser(String userId){
        player.getFriends().add(Player.getPlayerWithUser(userId));
        Player.getPlayerWithUser(userId).getFriends().add(player);
        player.getFriendRequest().remove(Player.getPlayerWithUser(userId));

    }
    public static void processDeclineUser(String userId){
        player.getFriendRequest().remove(Player.getPlayerWithUser(userId));
    }
    public static  void userValidation(String username){
       if(! Player.getAllPlayers().contains(Player.getPlayerWithUser(username)))
           output="this user doesn't  exists";
       else output="we requested the friend request";
    }
    public static void addUsername(String userName){
        userValidation(userName);
        if (output.equals("we requested the friend request"))
            Objects.requireNonNull(Player.getPlayerWithUser(userName)).getFriendRequest().add(FirstMenuFx.getLoggedInPlayer());

    }
}
