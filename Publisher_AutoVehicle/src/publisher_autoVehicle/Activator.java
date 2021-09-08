package publisher_autoVehicle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	
	ServiceRegistration publisherServiceRegistration;
	

	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Auto vehicle Publisher has Started.");
		AutoVehiclePublisher autoVehiclePublisher = new ServicePublisherImpl();
		
		publisherServiceRegistration = bundleContext.registerService(AutoVehiclePublisher.class.getName(), autoVehiclePublisher,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Auto vehicle Publisher has Stopped");
		publisherServiceRegistration.unregister();
	}

}
