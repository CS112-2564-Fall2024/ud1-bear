import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LongDistanceCoupleApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Login Page
        VBox loginLayout = new VBox(10);
        TextField emailField = new TextField();
        emailField.setPromptText("Enter Email");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Password");
        Button loginButton = new Button("Login");

        loginLayout.getChildren().addAll(emailField, passwordField, loginButton);
        Scene loginScene = new Scene(loginLayout, 400, 300);

        // Home Screen
        VBox homeLayout = new VBox(15);
        Button messagesButton = new Button("Messages");
        Button calendarButton = new Button("Calendar");
        Button tasksButton = new Button("Tasks");
        
        homeLayout.getChildren().addAll(messagesButton, calendarButton, tasksButton);
        Scene homeScene = new Scene(homeLayout, 400, 300);

        // Event Listener for Login Button (go to Home Screen after login)
        loginButton.setOnAction(e -> primaryStage.setScene(homeScene));

        // Set up the Stage
        primaryStage.setTitle("Long Distance Couple App");
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    User currentUser = new User("John Doe", "johndoe@email.com");
Message newMessage = new Message("John Doe", "Jane Doe", "Hello, I miss you!", "2024-12-11 15:30");
Task newTask = new Task("Plan date night", "John Doe", "2024-12-15");
Event newEvent = new Event("Anniversary", "2024-12-25", "Celebrating 1 year together");
Reminder newReminder = new Reminder(newEvent, "2024-12-24 12:00", "Reminder: Anniversary tomorrow!");

System.out.println("User: " + currentUser.getName());
System.out.println("Message from " + newMessage.getSender() + ": " + newMessage.getContent());
System.out.println("Task: " + newTask.getTaskName() + " - Due: " + newTask.getDueDate());
System.out.println("Event: " + newEvent.getTitle() + " - Date: " + newEvent.getDate());
System.out.println("Reminder: " + newReminder.getMessage());

}
