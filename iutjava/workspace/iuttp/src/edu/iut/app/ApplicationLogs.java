package edu.iut.app;

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for(int i =0; i<this.size();i++){
			if(this.get(i) instanceof ApplicationErrorLogs){
				filteredLogs.add(this.get(i));
			}
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for(int i =0; i<this.size();i++){
			if(this.get(i) instanceof ApplicationWarningLogs){
				filteredLogs.add(this.get(i));
			}
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for(int i =0; i<this.size();i++){
			if(this.get(i) instanceof ApplicationInfoLogs){		
				filteredLogs.add(this.get(i));
			}
		}
		return filteredLogs;
	}
	

}
