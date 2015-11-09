package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationWarningMessageDialog extends
		AbstractApplicationMessageDialog {

	@Override
	protected void showMessage(String level, String message) {
		boiteInfo = new JOptionPane();
		boiteInfo.showMessageDialog(null, message, level, JOptionPane.ERROR_WARNING);
	}

}
