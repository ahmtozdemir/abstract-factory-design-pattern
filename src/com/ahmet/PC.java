package com.ahmet;

public class PC extends Computer {
	 
    private String dissertation;
    private String thesis;
    private String project;
     
    public PC(String dissertation, String thesis, String project){
        this.dissertation=dissertation;
        this.thesis=thesis;
        this.project=project;
    }
    @Override
    public String getDissertation() {
        return this.dissertation;
    }
 
    @Override
    public String getThesis() {
        return this.thesis;
    }
 
    @Override
    public String getProject() {
        return this.project;
    }
 
}