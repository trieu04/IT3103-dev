package hust.soict.dsai.aims.screen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

import hust.soict.dsai.aims.cart.Cart;

public class App extends Application {
    private Cart cart;

    public App() {
        cart = new Cart();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Tải FXML và controller
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cart.fxml"));
        AnchorPane root = loader.load();

        // Cấu hình controller
        CartScreenController controller = loader.getController();
        controller.setCart(cart);

        // Hiển thị giao diện
        Scene scene = new Scene(root);
        primaryStage.setTitle("AIMS Cart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Khởi chạy ứng dụng JavaFX
    }
}
