import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class Chatbot extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextArea chatArea = new JTextArea();
    private JTextField inputField = new JTextField();
    private JButton sendButton = new JButton("SEND");

    Chatbot() {
        initializeUI();
        addActionListeners();
    }

    private void initializeUI() {
        setTitle("Chat with Sahrutha Reddy");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setResizable(true);
        setLocationRelativeTo(null);

        chatArea.setEditable(false);
        chatArea.setBackground(Color.WHITE);

        setLayout(null);

        add(chatArea);
        chatArea.setBounds(10, 10, 380, 300);

        add(inputField);
        inputField.setBounds(10, 320, 280, 30);

        add(sendButton);
        sendButton.setBounds(300, 320, 90, 30);
    }

    private void addActionListeners() {
    sendButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String text = inputField.getText().toLowerCase();
            chatArea.append("You --> " + text + "\n");
            inputField.setText("");

            if (text.contains("hi")) {
                replyMeth("Hello there!");
            } else if (text.contains("how are you")) {
                replyMeth("I'm doing well. Thank you for asking!");
            } else if (text.contains("good morning")) {
                replyMeth("Good Morning! How are you today?");
            } else if (text.contains("good")) {
                replyMeth("Nice to hear!");
            } else if (text.contains("good evening")) {
                replyMeth("Good Evening! How's your day going?");
            } else if (text.contains("what is your name")) {
                replyMeth("I'm your friendly ChatGPT!");
            } else if (text.contains("how old are you")) {
                replyMeth("I'm ageless in the digital realm!");
            } else if (text.contains("your interests")) {
                replyMeth("My main interest is assisting and chatting with you.");
            } else if (text.contains("tell me a joke")) {
                replyMeth("Sure, here's a joke: Why did the computer catch a cold? Because it had a virus!");
            } else if (text.contains("study")) {
                replyMeth("Are you working on anything specific? I'm here to help!");
            } else if (text.contains("favorite subject")) {
                replyMeth("I don't have personal preferences, but I can help you with various subjects!");
            } else if (text.contains("bye")) {
                replyMeth("Too soon :( Anyways, take care!");
            } else {
                // Default response for unrecognized input
                replyMeth("Sorry, I can't understand that. Feel free to ask me something else!");
            }
        }
    });
}


    private void replyMeth(String s) {
        chatArea.append("ChatBot --> " + s + "\n");
    }
}

public class ChatBotJava {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Chatbot().setVisible(true);
            }
        });
    }
}
