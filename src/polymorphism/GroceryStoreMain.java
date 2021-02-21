package polymorphism;
import java.util.Scanner; 
public class GroceryStoreMain {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("What aisle will you enter?");
			String aisle = scanner.nextLine(); 
			
			GroceryStore store = new SafewayStore();
			store.dairy();
			
			store = new SmartFinalStore();
			store.spices();
				
		}
}
