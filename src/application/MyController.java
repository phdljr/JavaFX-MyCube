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
			case "����":
				if(temp<=8) lb.setText("����");
				break;
			case "����":
				if(temp<=2) lb.setText("����ũ");
				break;
			case "����ũ":
				if(temp<=1) lb.setText("��������");
				break;
			}
		});
	}

}
