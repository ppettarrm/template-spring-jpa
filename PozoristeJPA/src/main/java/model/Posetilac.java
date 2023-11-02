package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the Posetilac database table.
 * 
 */
@Entity
@NamedQuery(name="Posetilac.findAll", query="SELECT p FROM Posetilac p")
public class Posetilac implements Serializable {
	private static final long serialVersionUID = 1L;

	public Posetilac() {
	}

}