package com.example.gameofthrones;

import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BlackSoldier extends GameElement {

    public BlackSoldier(int x, int y, int height, int width, AnchorPane pane) {
        super(x, y, height, width, pane);
    }
   @Override
    public void draw()
    {
        try
        {
            image = new Image(new FileInputStream("src\\main\\resources\\com\\example\\gameofthrones\\blackSoldier.png"));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
