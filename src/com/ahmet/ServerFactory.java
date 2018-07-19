package com.ahmet;

public class ServerFactory implements ComputerAbstractFactory {

	private String dissertation;
	private String thesis;
	private String project;
	
	public ServerFactory(String dissertation, String thesis, String project){
		this.dissertation=dissertation;
		this.thesis=thesis;
		this.project=project;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(dissertation,thesis,project);
	}

}