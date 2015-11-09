package edu.iut.app;

public class ApplicationErrorLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationErrorLog() {
		// la commade super cr�e le tableau demand�: le constructeur du p�re le fait
		super();
	}
	
	@Override
	public void setMessage(String message) {
		for (int i=0; i < this.listeners.size();i++){
			listeners.get(i).newMessage(message);
		}
		this.message = message;
		super.fireMessage("[ERROR]", this.message);
	}


}
