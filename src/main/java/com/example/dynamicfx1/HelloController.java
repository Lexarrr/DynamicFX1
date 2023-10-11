package com.example.dynamicfx1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class HelloController {
    @FXML
    private TextField txt1;

    @FXML
    private TextField resFile;

   @FXML
    VBox mainBox;

    protected void chooseFile() {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser
                .ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.setInitialDirectory(new File("C:\\Users\\Etc21\\IdeaProjects\\tiang3"));
        File file = fileChooser.showOpenDialog(new Stage());
        String name = String.valueOf(file);
        String s = name.replaceAll("\\\\", "/");
        resFile.setText(s);

    }

    @FXML
    protected void toWriteWord() throws IOException {
        String ss = resFile.getText();
        BufferedReader br = new BufferedReader(new FileReader(ss));
        String get;
        while(br.read()) {
            get = br.readLine();
            get.replace(",", "");
        }
        mainBox.getChildren().add(new Label(get));



    }

   @FXML
    private void plus()
   {
       String s = txt1.getText();

   }
}