import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ChatRoom {

    private List<User> users = new ArrayList<>();
    private static ChatBot chatBot = null;

    public void addUser(User user){
        users.add(user);
    }

    public void sendMessage(String message, User user) {
        if(!users.contains(user)){
            user.receiveMessage("Вие бяхте премахнат от стаята и не може да пишете в нея!");
            return;
        }
        if(message.equals("addBot") && chatBot == null){
            chatBot = ChatBot.getInstance();
            System.out.println("Чат бота беше добавен в стаята :)");
        }

        if(message.equalsIgnoreCase("cat") && chatBot != null){
            users.remove(user);
            for (var _user: users) {
                _user.receiveMessage("Думата 'cat' е забранена и нейното използване няма да бъде толерирано");
            }
        }
        else{
            for (var _user: users) {
                if(_user != user)
                    _user.receiveMessage(message);
            }
        }
    }


}
