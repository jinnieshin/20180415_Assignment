package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CalculatorViewController {
	@FXML
	private Button num0;
	@FXML
	private Button num1;
	@FXML
	private Button num2;
	@FXML
	private Button num3;
	@FXML
	private Button num4;
	@FXML
	private Button num5;
	@FXML
	private Button num6;
	@FXML
	private Button num7;
	@FXML
	private Button num8;
	@FXML
	private Button num9;
	@FXML
	private Button plus;
	@FXML
	private Button minus;
	@FXML
	private Button multiply;
	@FXML
	private Button divide;
	@FXML
	private Button equals;
	@FXML
	private Button clear;
	@FXML
	private TextArea ta;
	
	private void clickNum0() {
		ta.setText("0");
	}
	private void clickNum1() {
		ta.setText("1");
	}
	private void clickNum2() {
		ta.setText("2");
	}
	private void clickNum3() {
		ta.setText("3");
	}
	private void clickNum4() {
		ta.setText("4");
	}
	private void clickNum5() {
		ta.setText("5");
	}
	private void clickNum6() {
		ta.setText("6");
	}
	private void clickNum7() {
		ta.setText("7");
	}
	private void clickNum8() {
		ta.setText("8");
	}
	private void clickNum9() {
		ta.setText("9");
	}
	private void clickPlus() {
		ta.setText("+");
	}
	private void clickMinus() {
		ta.setText("-");
	}
	private void clickMultiply() {
		ta.setText("*");
	}
	private void clickDivide() {
		ta.setText("/");
	}
	private void clickEquals() {
		String s = ta.getText();
		//model 불러서 계산시키고 setText();
	}
	private void clickClear() {
		ta.setText("");
	}
}
