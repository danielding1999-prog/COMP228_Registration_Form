package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.*;
import javafx.scene.Group;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		Label title = new Label("Registration Form");
		HBox title_container = new HBox(15);
		title_container.setPadding(new Insets(10, 10, 10, 10));
		title_container.getChildren().add(title);
		;
		VBox navigator = new VBox(40);
		VBox form_container = new VBox(40);
		HBox submit_container = new HBox(40);
		navigator.setPadding(new Insets(10, 10, 10, 10));

		GridPane form = new GridPane();
		Label student_id = new Label("Student ID");
		Label name = new Label("Full Name");
		Label email = new Label("Email");
		Label program = new Label("Program Field");
		
		Button dashboard = new Button("Dashboard");
		Button registration = new Button("Registration");
		Button courses = new Button("Courses");
		Button help = new Button("Help");
		navigator.getChildren().addAll(dashboard, registration, courses, help);
		navigator.setAlignment(Pos.CENTER);
		title_container.setAlignment(Pos.CENTER);

		root.setTop(title_container);
		root.setLeft(navigator);

		try {
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Registration Form");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
