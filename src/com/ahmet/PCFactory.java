package com.ahmet;

public class PCFactory implements ComputerAbstractFactory {

	private String dissertation;
	private String thesis;
	private String project;
	
	public PCFactory(String dissertation, String thesis, String project){
		this.dissertation=dissertation;
		this.thesis=thesis;
		this.project=project;
	}
	@Override
	public Computer createComputer() {
		return new PC(dissertation,thesis,project);
	}

}