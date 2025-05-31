package ar.edu.unq.po2.tpcomposite.ej4;

import java.time.LocalDate;

public interface FileSystem {
	
	public int totalSize();
	
	public void printStructure();
	
	public LocalDate lastModified();
	
	public LocalDate oldestElement();
	
	public void addFile(FileSystem f);
	
	public void removeFile(FileSystem f);
	
}
