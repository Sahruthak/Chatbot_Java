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

                if (userInput.contains("hi")) {
                    replyMeth("Hello there!");
                } else if (userInput.contains("how are you")) {
                    replyMeth("I'm doing well. Thank you for asking!");
                } else if (userInput.contains("good morning")) {
                    replyMeth("Good Morning! How are you today?");
                } else if (userInput.contains("good evening")) {
                    replyMeth("Good Evening! How's your day going?");
                } else if (userInput.contains("what is your name")) {
                    replyMeth("I'm YYY");
                } else if (userInput.contains("how old are you")) {
                    replyMeth("I'm immortal, unless you mess with my system :(, so please don't!");
                } else if (userInput.contains("your interests")) {
                    replyMeth("My main interest is talking to you.");
                } else if (userInput.contains("tell me a joke")) {
                    replyMeth("Why don't scientists trust atoms? Because they make up everything!");
                } else if (userInput.contains("bye")) {
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
