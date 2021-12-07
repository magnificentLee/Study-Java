import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OkJavaGoInHomeInput {

	// args : parameter, �Ű�����
	// run configuration ���� �Ű������� ���� �Ҵ��Ҷ��� ū ����ǥ�� ������ߵ� -> �������� ��������ǥ��
	public static void main(String[] args) {
		
		String id = args[0];
		String bright = args[1];  // String ��, ��ȯ�ʿ�
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		// ctrl space �� �޼��带 �ҷ����� ���� import ���� �ڵ����� ����
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));  // % ����, String to Double
		moodLamp.on();
		
	}

}
