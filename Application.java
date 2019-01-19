import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 * 
 * @author Kasra and Tejas 
 * GUI to allow the user to interface with the main program 
 */
public class Application extends JFrame{
	/*//to see how outputs look like
	public static void main(String[] args) {
		Object[] closeByCities = DistanceCalculator.filterCities(39.2387, -77.2794, 100);
		for (Object i : closeByCities) {
			System.out.println(i);
		}
	}
	*/
	
	private JPanel parameterPanel;
	private JPanel labelPanel;
	private JTextArea cityViewer;
	private JLabel latitudeLabel;
	private JTextField latitude;
	private JLabel longitudeLabel;
	private JTextField longitude;
	private JLabel distanceLabel;
	private JTextField distance;
	private JButton submit;
	
	public Application() {
		super.setSize(600, 600);
		super.setTitle("City Finder Based on Location");
		parameterPanel = new JPanel();
		latitudeLabel = new JLabel("Latitude: ");
		latitude = new JTextField(7);
		longitudeLabel = new JLabel("Longitude: ");
		longitude = new JTextField(7);
		distanceLabel = new JLabel("Distance (mi)");
		distance = new JTextField(4);
		submit = new JButton("Submit");
		
		ActionListener listener = new AddButtonListener();
		submit.addActionListener(listener);
		parameterPanel.add(latitudeLabel);
		parameterPanel.add(latitude);
		parameterPanel.add(longitudeLabel);
		parameterPanel.add(longitude);
		parameterPanel.add(distanceLabel);
		parameterPanel.add(distance);
		parameterPanel.add(submit);
		add(parameterPanel, BorderLayout.NORTH);
		
		cityViewer = new JTextArea(2,2);
		cityViewer.setEditable(false);
		JScrollPane scroll = new JScrollPane (cityViewer, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(scroll,BorderLayout.CENTER);
		
	}

	
	class AddButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			cityViewer.setText("");
			City[] cityList = (City[]) DistanceCalculator.filterCities(Double.parseDouble(latitude.getText()), Double.parseDouble(longitude.getText()), Double.parseDouble(distance.getText()));
			for (City c: cityList){
				String[] cityData = c.getName().split(" ",2);
				cityViewer.append(cityData[1]+" ("+cityData[0].substring(0, 5)+" mi) " + " -- " + c.getLatitude()+ " , " + c.getLongitude()+"\n");
			}
		}
		
	}
	

}
