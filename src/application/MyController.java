package application;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MyController implements Initializable{
	@FXML
	private Button btn;
	@FXML
	private Label lb;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn.setOnAction((e)->{
			Random r = new Random();
			int temp = r.nextInt(100);
			switch(lb.getText()) {
			case "레어":
				if(temp<=8) lb.setText("에픽");
				break;
			case "에픽":
				if(temp<=2) lb.setText("유니크");
				break;
			case "유니크":
				if(temp<=1) lb.setText("레전더리");
				break;
			}
		});
	}

}
