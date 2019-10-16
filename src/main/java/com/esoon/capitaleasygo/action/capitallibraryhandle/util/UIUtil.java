package com.esoon.capitaleasygo.action.capitallibraryhandle.util;

import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class UIUtil {

	public static void changeProgressBarValue(final JProgressBar pbar,
			final int value, final boolean indeterminate) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				pbar.setValue(value);
				pbar.setIndeterminate(indeterminate);
				pbar.setStringPainted(!indeterminate);
			}
		});
	}
}
