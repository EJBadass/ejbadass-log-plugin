package fr.isima.ejbadass.log;

import fr.isima.ejb.annotation.Singleton;

@Singleton
public interface ILogger {
	
	public boolean contains(String string);
	
	public void log(String string);

	public String getAll();

}
