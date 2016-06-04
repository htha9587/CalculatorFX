package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Version 0.4
 * @author htha9587
 * 6-3-16
 */

public class MainController 
{
	@FXML
	private Label result;
	private long number1 = 0;
	private long number2 = 0;
	private String Operator = "";
	private boolean start = true;
	private Model model = new Model();
	
	/**
	 * Processes the number buttons.
	 * @param event
	 */
	@FXML
	public void processNumbers(ActionEvent event)
	{
		if(start)
		{
			result.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		result.setText(result.getText()+ value);
	}
	
	/**
	 * Processes the Operator buttons.
	 * @param event
	 */
	@FXML
	public void processOperators(ActionEvent event)
	{
		String value = ((Button)event.getSource()).getText();
		
		if(!value.equals("="))
		{
			if(!Operator.isEmpty())
				return;
			Operator = value;
			number1 = Long.parseLong(result.getText());
			result.setText("");
		}
			else
			{
				if(Operator.isEmpty())
					return;
				number2 = Long.parseLong(result.getText());
				float output = model.calculate(number1, number2, Operator);
				result.setText(String.valueOf(output));
				Operator = "";
				start = true;
			}
		}
	}
	

