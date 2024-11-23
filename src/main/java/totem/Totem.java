package totem;

import br.edu.ifsp.dsw1.model.observer.FlightDataObserver;
import java.util.List;
import java.util.ArrayList;
import br.edu.ifsp.dsw1.model.entity.*;

public abstract class Totem implements FlightDataObserver{
	protected List<FlightData> flights;
	
	public Totem() {
		flights = new ArrayList<FlightData>();
	}
	public List<FlightData> getAllFlights() {
		return flights;
	}
}
