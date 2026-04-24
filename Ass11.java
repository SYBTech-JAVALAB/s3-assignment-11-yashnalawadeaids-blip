import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class TrafficLightFX extends Application {
@Override
public void start(Stage stage) {
// Message Label
Label message = new Label("");
message.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
// Radio Buttons
RadioButton red = new RadioButton("Red");
RadioButton yellow = new RadioButton("Yellow");
RadioButton green = new RadioButton("Green");
// Toggle Group
ToggleGroup group = new ToggleGroup();
red.setToggleGroup(group);
yellow.setToggleGroup(group);
green.setToggleGroup(group);
// Event Handling
red.setOnAction(e -> {
message.setText("STOP");
message.setTextFill(Color.RED);
});
yellow.setOnAction(e -> {
message.setText("READY");
message.setTextFill(Color.GOLD);
});
green.setOnAction(e -> {
message.setText("GO");
message.setTextFill(Color.GREEN);
});
// Layout
VBox root = new VBox(15);
root.setPadding(new Insets(20));
root.getChildren().addAll(message, red, yellow, green);
// Scene
Scene scene = new Scene(root, 300, 200);
stage.setTitle("Traffic Light Simulator");
stage.setScene(scene);
stage.show();
}
public static void main(String[] args) {
launch(args);
}
}
