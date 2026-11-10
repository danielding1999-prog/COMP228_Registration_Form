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
		
		Button register = new Button("Register");
		Button clear = new Button("Clear");
		
		submit_container.getChildren().addAll(register, clear);

		GridPane form = new GridPane();
		form.setHgap(30);
		Label student_id = new Label("Student ID");
		Label name = new Label("Full Name");
		Label email = new Label("Email");
		Label program = new Label("Program Field");
		TextField student_id_text = new TextField();
		TextField name_text = new TextField();
		TextField email_text = new TextField();
		TextField program_text = new TextField();

		form.add(student_id, 0, 0);
		form.add(name, 0, 1);
		form.add(email, 0, 2);
		form.add(program, 0, 3);
		form.add(student_id_text, 1, 0);
		form.add(name_text, 1, 1);
		form.add(email_text, 1, 2);
		form.add(program_text, 1, 3);

		form_container.getChildren().add(form);
		form_container.setPadding(new Insets(30, 0, 0, 0));

		Button dashboard = new Button("Dashboard");
		Button registration = new Button("Registration");
		Button courses = new Button("Courses");
		Button help = new Button("Help");
		navigator.getChildren().addAll(dashboard, registration, courses, help);
		navigator.setAlignment(Pos.CENTER);
		title_container.setAlignment(Pos.CENTER);
		submit_container.setAlignment(Pos.BASELINE_RIGHT);

		root.setTop(title_container);
		root.setLeft(navigator);
		root.setCenter(form_container);
		root.setBottom(submit_container);

		try {
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Registration Form");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		clear.setOnAction(event ->{
			student_id_text.clear();
			name_text.clear();
			email_text.clear();
			program_text.clear();
			
		});
		
		register.setOnAction(event -> {
			if(student_id_text.getText() == null) {
				System.out.print("fuck");
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
