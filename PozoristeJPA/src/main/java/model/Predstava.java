package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the Predstava database table.
 * 
 */
@Entity
@NamedQuery(name="Predstava.findAll", query="SELECT p FROM Predstava p")
public class Predstava implements Serializable {
	private static final long serialVersionUID = 1L;

	public Predstava() {
	}

}