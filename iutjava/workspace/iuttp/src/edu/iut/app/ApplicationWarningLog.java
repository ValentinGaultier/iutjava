package edu.iut.app;

public class ApplicationWarningLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'hÃ©ritage ? */
	public ApplicationWarningLog() {
		// la commade super crée le tableau demandé: le constructeur du père le fait
		super();
	}
	
	@Override
	public void setMessage(String message) {
		for (int i=0; i < this.listeners.size();i++){
			listeners.get(i).newMessage(message);
		}
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
	}
}
