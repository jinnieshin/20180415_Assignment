package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextArea;

public class CalculatorViewController {
	@FXML
	private TextArea ta;
	@FXML
	private Button num7;
	@FXML
	private Button num8;
	@FXML
	private Button num9;
	@FXML
	private Button plus;
	@FXML
	private Button num4;
	@FXML
	private Button num5;
	@FXML
	private Button num6;
	@FXML
	private Button minus;
	@FXML
	private Button num1;
	@FXML
	private Button num2;
	@FXML
	private Button num3;
	@FXML
	private Button multiply;
	@FXML
	private Button clear;
	@FXML
	private Button num0;
	@FXML
	private Button equals;
	@FXML
	private Button divide;
	
	public void clickNum0() {
		ta.setText(ta.getText() + "0");
	}
	
	public void clickNum1() {
		ta.setText(ta.getText() + "1");
	}
	
	public void clickNum2() {
		ta.setText(ta.getText() + "2");
	}
	
	public void clickNum3() {
		ta.setText(ta.getText() + "3");
	}
	
	public void clickNum4() {
		ta.setText(ta.getText() + "4");
	}
	
	public void clickNum5() {
		ta.setText(ta.getText() + "5");
	}
	
	public void clickNum6() {
		ta.setText(ta.getText() + "6");
	}
	
	public void clickNum7() {
		ta.setText(ta.getText() + "7");
	}
	
	public void clickNum8() {
		ta.setText(ta.getText() + "8");
	}
	
	public void clickNum9() {
		ta.setText(ta.getText() + "9");
	}
	
	public void clickPlus() {
		ta.setText(ta.getText() + "+");
	}
	
	public void clickMinus() {
		ta.setText(ta.getText() + "-");
	}
	
	public void clickMultiply() {
		ta.setText(ta.getText() + "*");
	}
	
	public void clickDivide() {
		ta.setText(ta.getText() + "/");
	}
	
	public void clickEquals() {
		CalculatorModel m = new CalculatorModel();
		double ans = m.calculate(ta.getText());
		String s;
		if (ans - Math.floor(ans) == 0) {
			s = String.valueOf((int) ans);
		}
		else {
			s = String.valueOf(ans);
		}
		ta.setText(s);
	}
	
	public void clickClear() {
		ta.setText("");
	}
}
