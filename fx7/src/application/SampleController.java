package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    void onClickb1(ActionEvent event) {
		int t=Integer.parseInt(tf1.getText());
		double k=t*1.609344;
		int k1 = (int)(k*100);
		double k2 = k1/100.0;
		tf2.setText(t+" 마일은 "+k2+" 킬로미터입니다.");
    }

    @FXML
    void onClickb2(ActionEvent event) {
    	System.exit(0);
    }

}
