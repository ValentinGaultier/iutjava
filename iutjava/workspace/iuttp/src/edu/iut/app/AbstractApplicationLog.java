package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;
	/** TP1 : Tableau au sens des collections **/
	protected IApplicationLogListener listeners;
	
	public AbstractApplicationLog() {
		message = null;
		listeners = new IApplicationLogListener();
	}
	
    /** TP1 : Fonction venant de l'interface par héritage */

	void abstract setMessage(String message);
	String getMessage(){ return this.message; }
	void addListener(IApplicationLogListener listener){ this.listeners.add(listener);}
	IApplicationLogListener[] getpplicationLogListeners(){ return listeners; }
	
	/** Listener action */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
			
		}
	}
}
