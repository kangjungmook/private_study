package application;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class gradeController implements Initializable {
	@FXML Label lblSum, lblAvg;
	@FXML Button btnSum, btnAvg;
	@FXML TextField txtName,txtAA,txtBB;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	public void btnsumAction(ActionEvent event) {
		int temAA = Integer.parseInt(txtAA.getText());
		int temBB = Integer.parseInt(txtBB.getText());
		
		MulModel model = new MulModel();
		DecimalFormat df = new DecimalFormat("#,###");
		
		int temSum =  model.sum(temAA, temBB);
		
		lblSum.setText(df.format(temSum));

			
	}
	
	public void btnAvgAction(ActionEvent event) {
		int temAA = Integer.parseInt(txtAA.getText());
		int temBB = Integer.parseInt(txtBB.getText());
		
		MulModel model = new MulModel();
		DecimalFormat df = new DecimalFormat("#,###");
	
		int temAvg =  model.avg(temAA, temBB);
		
		lblAvg.setText(df.format(temAvg));

			
	}

}
