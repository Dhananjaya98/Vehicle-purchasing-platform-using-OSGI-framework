package publisher_manualVehicle;

import java.util.HashMap;

public class ServicePublisherImpl implements ManualVehiclePublisher{
	
	HashMap<String, Double> manual_suv = new HashMap<String, Double>();
	HashMap<String, Double> manual_sedan = new HashMap<String, Double>();
	HashMap<String, Double> manual_hatchback = new HashMap<String, Double>();
	
	
	public ServicePublisherImpl() {
		
		manual_suv.put("Toyota FJ Cruiser", 27906.0);
		manual_suv.put("Toyota RAV4", 26050.0);
		manual_suv.put("Land Rover Defender", 80500.0);
		manual_suv.put("Mitshubishi Montero 2010", 29000.0);
		
		manual_sedan.put("2016 Kia Forte", 22000.0);
		manual_sedan.put("Mitsubishi Lancer", 28000.0);
		manual_sedan.put("Subaru WRX", 31000.0);
		manual_sedan.put("Nissan Sunny", 18000.0);

		manual_hatchback.put("Volkswagen Golf GTI", 23195.0);
		manual_hatchback.put("Subaru Impreza Hatchback", 19195.0);
		manual_hatchback.put("2021 Kia Soul", 17590.0);
		manual_hatchback.put("Toyota Corolla Hatchback", 23615.0);
		
		
	}

	public void displayManualVehicle(int a) {
		// TODO Auto-generated method stub
		int count ;
		switch (a) {
		case 1:
			count = 1 ;
			for(String name1 : manual_suv.keySet()) {
				String key1 = name1.toString();
				String value1 = manual_suv.get(name1).toString();
				System.out.println(count + ". " + key1 + " :- $" +value1);
				count++;
			};
			break;
		case 2:
			count = 1 ;
			for(String name2 : manual_sedan.keySet()) {
				String key2 = name2.toString();
				String value2 = manual_sedan.get(name2).toString();
				System.out.println(count + ". " + key2 + " :- $" +value2);
				count++;
			};
			break;
			
		case 3: 
			count = 1 ;
			for(String name3 : manual_hatchback.keySet()) {
				String key3 = name3.toString();
				String value3 = manual_hatchback.get(name3).toString();
				System.out.println(count + ". " + key3 + " :- $" +value3);
				count++;
			};
			break;
			
		}
	}

	public double getPrice(int type, int manualvehicleName) {
		// TODO Auto-generated method stub
		double price = 0; 
		if(type == 1) {
			switch (manualvehicleName) {
			case 1:
				price = manual_suv.get("Toyota FJ Cruiser");
				break;
			case 2:
				price = manual_suv.get("Toyota RAV4");
				break;
			case 3:
				price = manual_suv.get("Land Rover Defender");
				break;
			case 4:
				price = manual_suv.get("Land Rover Defender");
				break;
			}
		}else if(type == 2) {
			switch (manualvehicleName) {
			case 1:
				price = manual_sedan.get("2016 Kia Forte");
				break;
			case 2:
				price = manual_sedan.get("Mitsubishi Lancer");
				break;
			case 3:
				price = manual_sedan.get("Subaru WRX");
				break;
			case 4:
				price = manual_sedan.get("Nissan Sunny");
				break;
			}
			
		}else if(type == 3) {
			switch (manualvehicleName) {
			case 1:
				price = manual_hatchback.get("Volkswagen Golf GTI");
				break;
			case 2:
				price = manual_hatchback.get("Subaru Impreza Hatchback");
				break;
			case 3:
				price = manual_hatchback.get("2021 Kia Soul");
				break;
			case 4:
				price = manual_hatchback.get("Toyota Corolla Hatchback");
				break;
			}
			
		}
		return price;
	}
	
	public String getName(int type, int manualvehicleName) {
		// TODO Auto-generated method stub
		String name = ""; 
		if(type == 1) {
			switch (manualvehicleName) {
			case 1:
				name = "Toyota FJ Cruiser";
				break;
			case 2:
				name = "Toyota RAV4";
				break;
			case 3:
				name = "Land Rover Defender";
				break;
			case 4:
				name = "Land Rover Defender";
				break;
			}
		}else if(type == 2) {
			switch (manualvehicleName) {
			case 1:
				name = "2016 Kia Forte";
				break;
			case 2:
				name = "Mitsubishi Lancer";
				break;
			case 3:
				name = "Subaru WRX";
				break;
			case 4:
				name = "Nissan Sunny";
				break;
			}
			
		}else if(type == 3) {
			switch (manualvehicleName) {
			case 1:
				name = "Volkswagen Golf GTI";
				break;
			case 2:
				name = "Subaru Impreza Hatchback";
				break;
			case 3:
				name = "2021 Kia Soul";
				break;
			case 4:
				name = "Toyota Corolla Hatchback";
				break;
			}
			
		}
		return name;	
	}
}
