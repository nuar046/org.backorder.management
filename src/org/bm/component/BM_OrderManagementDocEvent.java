/**
import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.osgi.service.event.Event;

public class BM_OrderManagementDocEvent extends AbstractEventHandler {
 	private static CLogger log = CLogger.getCLogger(BM_OrderManagementDocEvent.class); 

	@Override 
	protected void initialize() {  
		log.info("BM_OrderManagement<PLUGIN> .. IS NOW INITIALIZED");
		}

	@Override 
	protected void doHandleEvent(Event event){  
	  }
 
 
}