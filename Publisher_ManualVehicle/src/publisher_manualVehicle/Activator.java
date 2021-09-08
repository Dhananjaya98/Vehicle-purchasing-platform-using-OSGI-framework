package publisher_manualVehicle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publisherServiceRegistration;
	
	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Manual vehicle Publisher has Started.");
		
		ManualVehiclePublisher manualVehiclePublisher = new ServicePublisherImpl();
		publisherServiceRegistration = bundleContext.registerService(ManualVehiclePublisher.class.getName(), manualVehiclePublisher, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Manual vehicle Publisher has Stopped");
		publisherServiceRegistration.unregister();
	}

}
