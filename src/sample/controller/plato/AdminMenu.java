package sample.controller.plato;


import sample.model.platoModel.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class AdminMenu {
    private static Admin admin;
    public static String validationEvent(LocalDate start, LocalDate end, String score, String gameName){
        if (!start.isBefore(end))
            return "start of the date must be before end";
        else if(start.isBefore(LocalDate.now()))
            return "start of the date must be after now";
        else if(end.isBefore(LocalDate.now()))
            return "end of the date must be after now";
        else if (!score.matches(
                "\\d+"))
            return "you must enter a number!!";
        else{
           // processAddEvent(start,end, Integer.parseInt(score),gameName);
            return "event added successfully!";}
    }
    public static void setAdmin(Admin admin) {
        AdminMenu.admin = admin;
    }
    public static String sendPBMessage(String user,String message) {
        if (!Player.getAllPlayers().contains(Player.getPlayerWithUser(user))){
            return "invalid userID entered";
        }
        else {
            PBMessage pbMessage=new PBMessage(message);
           // pbMessage.setTime();
            Player.getPlayerWithUser(user).getPlatoMessages().add(pbMessage);
            return "Message sent successfully";
        }

    }
    public static void processAddEvent(LocalDate start, LocalDate end, int score, String gameName){
        validationEvent(start,end,String.valueOf(score),gameName);
        if (validationEvent(start,end,String.valueOf(score),gameName).equalsIgnoreCase("event added successfully!")){
        Event event=new Event(UUID.randomUUID().toString(),gameName,start,end,score);}

    }
    public String editEvent(String field, String eventID, String newValue){
        if (field.equalsIgnoreCase("score")){
            Event.getEventWithId(eventID).setEventScore(Integer.parseInt(newValue));
        }
        else if (field.equalsIgnoreCase("game")){
            Event.getEventWithId(eventID).setGameName(newValue);
        }
        else
            return "invalid field entered";
        return null;
    }
  //  public void processViewEvent(){Event.toString()}
    public String processRemoveEvent(String eventId){
       if (Event.getAllEvents().contains(Event.getEventWithId(eventId))){
           Event.getAllEvents().remove(Event.getEventWithId(eventId));
           return "event removed";
       }
       else return "invalid event id";

    }
    public boolean userNameValidationForSug(){return true;}
    public static String addSuggestion(String userName, String gameName){
        if(!Player.getAllPlayers().contains(Player.getPlayerWithUser(userName))){
            return "invalid userName";
        }
        else if (!gameName.equalsIgnoreCase("reversi")&&!gameName.equalsIgnoreCase("dots and boxes"))
            return "invalid gameName";
        else if (!Player.getPlayerWithUser(userName).getSuggestions().isEmpty()){
        for (Suggestion suggestion : Player.getPlayerWithUser(userName).getSuggestions()) {
            if (suggestion.getSuggestedGame().equalsIgnoreCase(gameName)){
                return "you have already suggested this game";
            }
        }}
        else{
            Suggestion suggestion=new Suggestion( gameName,UUID.randomUUID().toString(),userName);
            return "suggestion added successfully";
        }
        return null;

    }
  //  public void idSugValidation(String suggestionId){}
    public static String removeSuggestion(String suggestionId){
       if (!Suggestion.getAllSugs().contains(Suggestion.getSugwithId(suggestionId))){
            return "invalid suggestion id";
        }
       else{
           Suggestion.getAllSugs().remove(Suggestion.getSugwithId(suggestionId));
            return "suggestion removed";

       }
    }

}
