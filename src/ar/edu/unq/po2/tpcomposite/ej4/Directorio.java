package ar.edu.unq.po2.tpcomposite.ej4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Directorio implements FileSystem {

	private Collection<FileSystem> elementos;
	
	public Directorio() {
		this.elementos = new ArrayList<FileSystem>();
	}
	
	public int totalSize() {
		int size = 0;
		for(FileSystem e : elementos) {
			size += e.totalSize();
		}
		return size;
	}
	
	public void printStructure() {
		
	}
	
	public LocalDate lastModified() {
		return LocalDate.now();
	}
	
	public LocalDate oldestElement() {
		LocalDate oldest = LocalDate.now();
		for(FileSystem f : elementos) {
			if (oldest.isAfter(f.lastModified())) {
				oldest = f.lastModified();
			}
		}
		return oldest;
	}
	
	public void addFile(FileSystem f) {
		elementos.add(f);
	}
	
	public void removeFile(FileSystem f) {
		elementos.remove(f);
	}
	
}
