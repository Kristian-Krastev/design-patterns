public class User {

    private String name;
    private ChatRoom mediator;

    public User(String name, ChatRoom mediator){
        this.name = name;
        this.mediator = mediator;
        mediator.addUser(this);
    }

    public void sendMessage(String message){
        System.out.println(name + " изпрати съобщението: \"" + message + "\"");
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message){
        System.out.println("Съобщението \"" + message + "\" стигна до потребител \"" + name + "\"");
    }

}
