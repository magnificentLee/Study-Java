import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OkJavaGoInHomeInput {

	// args : parameter, 매개변수
	// run configuration 에서 매개변수를 따로 할당할때는 큰 따옴표로 나눠줘야됨 -> 구버전은 작은따옴표임
	public static void main(String[] args) {
		
		String id = args[0];
		String bright = args[1];  // String 값, 변환필요
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		// ctrl space 로 메서드를 불러오면 위에 import 까지 자동으로 해줌
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));  // % 단위, String to Double
		moodLamp.on();
		
	}

}
