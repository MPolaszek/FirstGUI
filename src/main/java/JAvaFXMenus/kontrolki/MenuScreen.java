package JAvaFXMenus.kontrolki;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class MenuScreen {

	private MainController mainController;
	
    @FXML
    void exit(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void openAplication(ActionEvent event) {
    	FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/JAvaFXMenus/resources/AppScreen.fxml"));
    	Pane pane = null;
    	try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	AppController appController = loader.getController();
    	appController.setMainController(mainController);
    	mainController.setScreen(pane);
    }

    @FXML
    void options(ActionEvent event) {
    	FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/JAvaFXMenus/resources/OptionScreen.fxml"));
    	Pane pane = null;
    	try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	OptionController optionController = loader.getController();
    	optionController.setMainController(mainController);
    	mainController.setScreen(pane);
    }
    
    public void setMainController(MainController mainController) {
    	this.mainController = mainController;
    }
}
