/*
 * This software has been provided to provide sample code and to aid
 * the software engineering community. It is published under the MIT
 * license. You are welcome to use the code, but please do not take
 * credit for my work.
 *
 * Author: DenalidTX
 * Twitter: @DenalidTX
 * Twitch: https://www.twitch.tv/denalidtx
 */

package com.denalidtx.samples.jpms.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This is a standard JavaFX application.
 */
public class Main extends Application
{

    /**
     * Standard main method, which starts the JavaFX application.
     *
     * @param args Command-line arguments. Not used by this application.
     */
    public static void main(String[] args)
    {
        launch(args);
    }

    /**
     * Standard JavaFX start method. It loads an FXML file and displays
     * the resulting scene in the main stage. (In non-FX terms, it
     * creates a panel and shows it in a window.) The application will
     * exit when the window closes.
     *
     * @param primaryStage Stage, provided by the JavaFX platform.
     */
    @Override
    public void start(Stage primaryStage)
    {
        Parent root;
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/HelloWorld.fxml"));
            root = loader.load();
            primaryStage.setTitle("JPMS JavaFX Sample");
            final Scene scene = new Scene(root, 400, 300);
            primaryStage.setScene(scene);
            primaryStage.show();
            // This prevents the application becoming a zombie when we close the window.
            primaryStage.setOnCloseRequest(windowEvent -> System.exit(0));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
