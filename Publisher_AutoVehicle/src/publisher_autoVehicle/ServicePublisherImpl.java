package publisher_autoVehicle;

import java.util.HashMap;

public class ServicePublisherImpl implements AutoVehiclePublisher {
	
	HashMap<String, Double> auto_suv = new HashMap<String, Double>();
	HashMap<String, Double> auto_sedan = new HashMap<String, Double>();
	HashMap<String, Double> auto_hatchback = new HashMap<String, Double>();
	
	public ServicePublisherImpl() {
		
		auto_suv.put("Honda CR-V", 42.0);
		auto_suv.put("Toyota Land Cruiser", 38.0);
		auto_suv.put("Nissan X-Trail", 40.0);
		auto_suv.put("Benz AMG G63", 45.0);
		
		auto_sedan.put("Honda City", 20.0);
		auto_sedan.put("Hyundai Verna", 22.0);
		auto_sedan.put("Toyota Yaris", 28.0);
		auto_sedan.put("Audi A4", 18.0);
		
		auto_hatchback.put("Audi A3 Sportback", 22.0);
		auto_hatchback.put("BMW X1", 25.0);
		auto_hatchback.put("Mazda 3", 23.0);
		auto_hatchback.put("Honda Civic", 20.0);
		
		
	}
	
	public void displayAutoVehicle(int a) {
		// TODO Auto-generated method stub
		int count ;
		switch (a) {
		case 1:
			count = 1 ;
			for(String name1 : auto_suv.keySet()) {
				String key1 = name1.toString();
				String value1 = auto_suv.get(name1).toString();
				System.out.println(count + ". " + key1 + " :- $" +value1);
				count++;
			};
			break;
		case 2:
			count = 1 ;
			for(String name2 : auto_sedan.keySet()) {
				String key2 = name2.toString();
				String value2 = auto_sedan.get(name2).toString();
				System.out.println(count + ". " + key2 + " :- $" +value2);
				count++;
			};
			break;
			
		case 3: 
			count = 1 ;
			for(String name3 : auto_hatchback.keySet()) {
				String key3 = name3.toString();
				String value3 = auto_hatchback.get(name3).toString();
				System.out.println(count + ". " + key3 + " :- $" +value3);
				count++;
			};
			break;
			
		}
		count = 0;
	}

	public double getPrice(int type, int autoVehicleName) {
		// TODO Auto-generated method stub
		double price = 0; 
		if(type == 1) {
			switch (autoVehicleName) {
			case 1:
				price = auto_suv.get("Honda CR-V");
				break;
			case 2:
				price = auto_suv.get("Toyota Land Cruiser");
				break;
			case 3:
				price = auto_suv.get("Nissan X-Trail");
				break;
			case 4:
				price = auto_suv.get("Benz AMG G63");
				break;
			}
		}else if(type == 2) {
			switch (autoVehicleName) {
			case 1:
				price = auto_sedan.get("Honda City");
				break;
			case 2:
				price = auto_sedan.get("Hyundai Verna");
				break;
			case 3:
				price = auto_sedan.get("Toyota Yaris");
				break;
			case 4:
				price = auto_sedan.get("Audi A4");
				break;
			}
			
		}else if(type == 3) {
			switch (autoVehicleName) {
			case 1:
				price = auto_hatchback.get("Audi A3 Sportback");
				break;
			case 2:
				price = auto_hatchback.get("BMW X1");
				break;
			case 3:
				price = auto_hatchback.get("Mazda 3");
				break;
			case 4:
				price = auto_hatchback.get("Honda Civic");
				break;
			}
			
		}
		return price;	
	}	
	
	public String getName(int type, int autoVehicleName) {
		// TODO Auto-generated method stub
		String name = ""; 
		if(type == 1) {
			switch (autoVehicleName) {
			case 1:
				name = "Honda CR-V";
				break;
			case 2:
				name = "Toyota Land Cruiser";
				break;
			case 3:
				name = "Nissan X-Trail";
				break;
			case 4:
				name = "Benz AMG G63";
				break;
			}
		}else if(type == 2) {
			switch (autoVehicleName) {
			case 1:
				name = "Honda City";
				break;
			case 2:
				name = "Hyundai Verna";
				break;
			case 3:
				name = "Toyota Yaris";
				break;
			case 4:
				name = "Audi A4";
				break;
			}
			
		}else if(type == 3) {
			switch (autoVehicleName) {
			case 1:
				name = "Audi A3 Sportback";
				break;
			case 2:
				name = "BMW X1";
				break;
			case 3:
				name = "Mazda 3";
				break;
			case 4:
				name = "Honda Civic";
				break;
			}
			
		}
		return name;	
	}	
	
	
}


