package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the Mesto database table.
 * 
 */
@Entity
@NamedQuery(name="Mesto.findAll", query="SELECT m FROM Mesto m")
public class Mesto implements Serializable {
	private static final long serialVersionUID = 1L;

	public Mesto() {
	}

}