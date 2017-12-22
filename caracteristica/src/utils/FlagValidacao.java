package utils;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class FlagValidacao {
	

	public FlagValidacao() {}

	public void Clear() throws BackingStoreException {
		Preferences prefsRoot = Preferences.userRoot();
		Preferences myPrefs = prefsRoot.node("fxture_plugin");
		myPrefs.clear();
	}

	public void setFase(String key, String value) throws Exception {
		Preferences prefsRoot = Preferences.userRoot();
		Preferences myPrefs = prefsRoot.node("fxture_plugin");
		myPrefs.put(key, value);
	}

	public String getFase(String key, String defaultValue) throws Exception {
		Preferences prefsRoot = Preferences.userRoot();
		Preferences myPrefs = prefsRoot.node("fxture_plugin");
		String s = myPrefs.get(key, defaultValue);
		return myPrefs.get(key, defaultValue);
	}
}