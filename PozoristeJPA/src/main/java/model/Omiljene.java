package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the Omiljene database table.
 * 
 */
@Entity
@NamedQuery(name="Omiljene.findAll", query="SELECT o FROM Omiljene o")
public class Omiljene implements Serializable {
	private static final long serialVersionUID = 1L;

	public Omiljene() {
	}

}