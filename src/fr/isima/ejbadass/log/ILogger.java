package fr.isima.ejbadass.log;

public interface ILogger {
	
	public boolean contains(String string);
	
	public void log(String string);

	public String getAll();

}
