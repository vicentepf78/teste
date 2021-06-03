import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Questao2 {

	public static void main(String[] args) {
		
		MapAlertDAO mapAlertDAO = new MapAlertDAO();
		AlertService alertService = new AlertService(mapAlertDAO); 
		
		
		System.out.println(alertService.raiseAlert());
		System.out.println(alertService.getAlertTime(null));

	}
}

class AlertService {
	
	private AlertDAO alertDAO;
	
	public AlertService(AlertDAO alertDAO) {
		this.alertDAO = alertDAO;
	}

	public UUID raiseAlert() {
		return this.alertDAO.addAlert(new Date());
	}

	public Date getAlertTime(UUID id) {
		return this.alertDAO.getAlert(id);
	}
}

class MapAlertDAO implements AlertDAO {
	private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

	public UUID addAlert(Date time) {
		UUID id = UUID.randomUUID();
		this.alerts.put(id, time);
		return id;
	}

	public Date getAlert(UUID id) {
		return this.alerts.get(id);
	}
}

interface AlertDAO {
	
	UUID addAlert(Date time);	
	Date getAlert(UUID id);

}

