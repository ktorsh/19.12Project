import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

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
	private JList cityViewer;
	
	public Application() {
		super.setSize(600, 600);
		super.setTitle("City Finder Based on Location");
		parameterPanel = createParameterPanel();
		labelPanel = createLabelPanel();
		cityViewer = createCityViewer();
		//finish GUI - 	kasra
	}

	private JList createCityViewer() {
		// TODO Auto-generated method stub
		return null;
	}

	private JPanel createLabelPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	private JPanel createParameterPanel() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
