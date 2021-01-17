package sample.controller.plato;


import sample.controller.graphic.plato.FirstMenuFx;
import sample.controller.graphic.plato.RegisterMenuFx;
import sample.model.platoModel.Admin;
import sample.model.platoModel.Player;

import javax.swing.*;
import java.util.UUID;

public class RegisterMenu {
   // private Account toRegisterAccount;
    //public void register(){}
    private static int num;

    private static boolean registered;
    public static int getNum() {
        return num;
    }

    public static void userPassValidation(String username, String password,String email,String phone) {
        if (Player.getAllPlayers().contains(Player.getPlayerWithUser(username))){
           // CommandProcessor.setOutput(2);
            num= 2;
        }
        else if (password.length() < 9) {
            //CommandProcessor.setOutput(3);
            num= 3;
        } else if (password.length() > 26){
          //  CommandProcessor.setOutput(4);
            num= 4;}
            else if(!email.matches("^.+@.+$"))
                num= 7;
            else if (!phone.matches("\\d{11}"))
                num= 8;

        //user and password are right
        num= 9;
    }
    //account id ro random bezar
    public static void registerAccount(String username, String password, String name, String lastname, String email, String phone)throws NullPointerException {
        userPassValidation(username,password,email,phone);
        if (num==9){
        String uniqueID = UUID.randomUUID().toString();
        if (!Admin.isThereAdmin){
          registerAdmin(username,password,name,lastname,email,phone);
            FirstMenuFx.setLoggedInAdmin(Admin.getAdminWithUser(username));
            System.out.println(Admin.getAdminWithUser(username));
            Admin.isThereAdmin=true;
            registered=true;

         //   RegisterMenuFx.setFirstReg(false);
          //  CommandProcessor.setMainMenuStatus(MainMenuStatus.AdminMenu);
        }
        if (!registered){
           registerPlayer(username,password,name,lastname,email,phone);
            FirstMenuFx.setLoggedInPlayer(Player.getPlayerWithUser(username));
            registered=false;
            System.out.println(Player.getPlayerWithUser(username));
            //CommandProcessor.setMainMenuStatus(MainMenuStatus.PlayerMenu);
        }}
        Admin.isThereAdmin=true;
    }
    public static void registerPlayer(String username, String password, String name, String lastName, String email, String phone){
        Player player= new Player(username,password);
        player.setDetails(name,lastName,UUID.randomUUID().toString(),email,phone);
        player.setPlatoAge();
    }
    public static void registerAdmin(String username, String password, String name, String lastName, String email, String phone){
         Admin admin=new Admin(username,password);
         admin.setDetails(name,lastName,UUID.randomUUID().toString(),email,phone);

          }
    public static void addAdminDetails(Admin admin, String name, String lastName, String accountID, String email, String phone){
        admin.setDetails(name,lastName,accountID,email,phone);
    }
    public static void addPlayerDetails(Player player, String name, String lastName, String accountID, String email, String phone){
        player.setDetails(name,lastName,accountID,email,phone);
    }

}
