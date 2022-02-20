package yogita.Driver;

import yogita.Service.SLService;
import yogita.Service.SLServiceImpl;

public class SankeAndLadderDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLService service= new SLServiceImpl();
		service.play(2, 1);
		

	}

}
