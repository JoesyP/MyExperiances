
import java.io.IOException;
/**
 * 
 * @author CS3443
 *
 */
public class main {

	public static void main(String[] args) {

		ShowRoomE Showroom = new ShowRoomE("Cars.csv");

		try {

			Showroom.loadCar();

			System.out.println("The UTSA showroom is home to the following cars:");

			for(DrivableE car : Showroom.getVehicles() ) {
				System.out.println(car);
			}
			System.out.println("\n\nThe cars were started:");
			for(DrivableE animal : Showroom.getVehicles() ) {
				animal.start();
			}

			System.out.println("\n\nThe cars were driven:");

		
			for(DrivableE animal : Showroom.getVehicles() ) {
				animal.drive();
			}
			
			System.out.println("\n\nThe cars were stopped:");
			for(DrivableE animal : Showroom.getVehicles() ) {
				animal.stop();
			}




		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}