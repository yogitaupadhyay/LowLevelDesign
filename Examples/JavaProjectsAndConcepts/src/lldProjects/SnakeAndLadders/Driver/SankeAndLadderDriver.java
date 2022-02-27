package lldProjects.SnakeAndLadders.Driver;

import lldProjects.SnakeAndLadders.Service.SLService;
import lldProjects.SnakeAndLadders.Service.SLServiceImpl;

public class SankeAndLadderDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLService service= new SLServiceImpl();
		service.play(3, 3);
		

	}

}
