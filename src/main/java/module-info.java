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

module javafx.jpms.sample
{
    // This is required for Application, Scene, and the Node types.
    requires javafx.controls;

    // This is required for FXMLLoader.
    requires javafx.fxml;

    // If you don't export to javafx.graphics, your app won't start.
    exports com.denalidtx.samples.jpms.javafx to javafx.graphics;
    // If you don't export to javafx.fxml, JavaFX will fail to
    // instantiate your FXML file's controller.
    exports com.denalidtx.samples.jpms.javafx.controller to javafx.fxml;

}