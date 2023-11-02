package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the Ocena database table.
 * 
 */
@Entity
@NamedQuery(name="Ocena.findAll", query="SELECT o FROM Ocena o")
public class Ocena implements Serializable {
	private static final long serialVersionUID = 1L;

	public Ocena() {
	}

}