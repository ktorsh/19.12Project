import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Application extends JFrame{
	/*//to see how outputs look like
	public static void main(String[] args) {
		Object[] closeByCities = DistanceCalculator.filterCities(39.2387, -77.2794, 100);
		for (Object i : closeByCities) {
			System.out.println(i);
		}
	}
	FINISH GUI KASRA
	*/
	
	private JPanel parameterPanel;
	private JPanel labelPanel;
	private JList cityViewer;
	
	public Application() {
		super.setSize(600, 600);
		super.setTitle("City Finder Based on Location");
		parameterPanel = createParameterPanel();
		labelPanel = createLabelPanel();
		cityViewer = createCityViewer();
		
	}

	private JList createCityViewer() {
		// TODO Auto-generated method stub
		return null;
	}

	private JPanel createLabelPanel() {
		JLabel latitudeLabel = new JLabel("Latitude: ");
		JTextField latitude = new JTextField("Negative if South");
		JLabel longitudeLabel = new JLabel("Longitude: ");
		
		return null;
	}

	private JPanel createParameterPanel() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
