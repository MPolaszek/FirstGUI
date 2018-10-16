package JAvaFXMenus.kontrolki;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AppController {
	
	private MainController mainController;
	
    @FXML
    void backMenu(ActionEvent event) {
    	mainController.loadMenuScreen();
    	
    }

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
    
    

}
