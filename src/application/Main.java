package application;
	



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	private static int nClicks = 0;
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
			 * BorderPane root = new BorderPane();
			 *  Scene scene = new Scene(root,400,400);
			 * scene.getStylesheets().add(getClass().getResource("application.css").
			 * toExternalForm());
			 *  primaryStage.setScene(scene); primaryStage.show();
			 */
			
			GridPane gridPane = new GridPane();
			gridPane.setPadding(new Insets(50 , 50, 50, 50));
			
			/*
			 * Button button = new Button(); gridPane.add(button, 1, 2);
			 */
			
			Text text = new Text();
			text.setText("Kiro shamara");
			gridPane.add(text, 1, 2);
			
			
			Label l1 = new Label();
			l1.setText("Username");
			gridPane.add(l1, 0, 1);
			
			Label l2 = new Label();
			l2.setText("Password");
			gridPane.add(l2, 1, 0);
			
			Button button1 = new Button("Button 1");
			Button button2 = new Button("Button 2");
			Button button3 = new Button("Button 3");
			Button button4 = new Button("Button 4");
			Button button5 = new Button("Button 5");
			Button button6 = new Button("Button 6");
			
			gridPane.add(button1, 0, 0, 1, 1);
			gridPane.add(button2, 1, 0, 1, 1);
			gridPane.add(button3, 2, 0, 1, 1);
			gridPane.add(button4, 0, 1, 1, 1);
			gridPane.add(button5, 1, 1, 1, 1);
			gridPane.add(button6, 2, 1, 1, 1);
			
			
			PasswordField passwordField = new PasswordField();
			gridPane.add( passwordField, 1, 0);
			
			TextArea area = new TextArea("This is a text area");
			gridPane.add(area, 2, 2);
			
			TextField field = new TextField("This is a text field");
			gridPane.add(field, 1, 1);
			
			
			 Button button = new Button("Click Me!");
		        button.setOnAction(event -> {
		            nClicks++;
		            System.out.println("Clicked " + nClicks + " times.");
		            field.setText(String.valueOf(nClicks));
		            area.setText(String.valueOf(nClicks));
		        });
		        button.setPadding(new Insets(10));
		        button.setPrefWidth(100);
		        
		        gridPane.add(button, 10, 10);
				
			
			
			
			Scene scene2 = new Scene(gridPane, 400, 500);
			
			primaryStage.setScene(scene2);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
