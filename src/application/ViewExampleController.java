package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextArea;

public class ViewExampleController {
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private TextArea ta1;
	
	public void onClickButton1() {
		button1.setText("Clicked");
	}

}
