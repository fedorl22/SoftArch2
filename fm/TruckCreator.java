package fm;

public class TruckCreator extends CourierTransportCreator{
	@Override
	public CourierTransport createTransport() {
    		return new Truck();
	}
}
