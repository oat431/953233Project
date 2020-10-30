package view;

import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.image.*;


public class Menu extends GridPane {

    public Button white;
    public Button black;
    public Label playAs;
    public Data data;
    public Menu(Data data) {
        playAs = new Label("Play AS");
        white = new Button("Play as white",new ImageView(data.playAsWhite));
        black = new Button("Play as Black",new ImageView(data.playAsBlack));
        playAs.setTextFill(Color.web("#ffffff"));
        playAs.setFont(Font.font("Arial", 50));
        this.data=data;
        setVgap(20);
        setHgap(100);
        add(playAs,5,5);
        add(white,6,18);
        add(black,6,22);
        BackgroundImage backgroundImage = new BackgroundImage(data.bgImage,BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        setBackground(new Background(backgroundImage));

        white.setOnAction(actionEvent -> data.setPlayerWhite());
        black.setOnAction(actionEvent -> data.setPlayerBlack());

        white.setOnKeyPressed(e->{
            if (e.getCode() == KeyCode.W) {
                data.setPlayerWhite();
            }
        });

        black.setOnKeyPressed(e->{
            if (e.getCode() == KeyCode.B) {
                data.setPlayerBlack();
            }
        });
    }

}
