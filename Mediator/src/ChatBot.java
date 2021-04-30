public class ChatBot {

    private static ChatBot chatBotSingleton;

    private ChatBot() {}

    public static ChatBot getInstance() {
        if(chatBotSingleton == null)
            chatBotSingleton = new ChatBot();

        return chatBotSingleton;
    }

}
