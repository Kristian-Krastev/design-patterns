public class Main {

    public static void main(String[] args) {

        ChatRoom mediator = new ChatRoom();

        User user1 = new User("Пешо", mediator);
        User user2 = new User("Гошо", mediator);
        User user3 = new User("Иван", mediator);

        user1.sendMessage("Здравейте всички!");
        user2.sendMessage("cat");
        user3.sendMessage("addBot");
        user1.sendMessage("cat");
        user1.sendMessage("Опс");
        user2.sendMessage("Какво стана с Пешо?");
    }

}
