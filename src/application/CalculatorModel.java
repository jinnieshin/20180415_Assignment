package application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorModel {
	
	private static String alphabetPattern = "(?<firstNum>[0-9]+)[\\s]*(?<sign>[+\\-*/])[\\s]*(?<secondNum>[0-9]+)";
	private static Pattern p = Pattern.compile(alphabetPattern);
	
	public Double calculate(String s) {
		Matcher m = p.matcher(s);
		
		double ans;
		
		if (!m.matches()) {
			return 0.0;
		}
		
		switch(m.group("sign")) {
		case "+" :
			ans = Double.parseDouble(m.group("firstNum")) + Double.parseDouble(m.group("secondNum"));
			break;
		case "-" :
			ans = Double.parseDouble(m.group("firstNum")) - Double.parseDouble(m.group("secondNum"));
			break;
		case "*" : 
			ans = Double.parseDouble(m.group("firstNum")) * Double.parseDouble(m.group("secondNum"));
			break;
		case "/" :
			ans = Double.parseDouble(m.group("firstNum")) / Double.parseDouble(m.group("secondNum"));
			break;
		default:
			ans = 0;
		}
		return ans;
	}
}
