package totem;

import br.edu.ifsp.dsw1.model.entity.FlightData;

public class TotemArriving extends Totem {
	
	public TotemArriving() {
		super();
	}

	@Override
	public void update(FlightData flight) {
		if (flight.getState().getClass().getSimpleName() == "Arriving") {
			flights.add(flight);
		} else {
			flights.remove(flight);
		}
	}

}
