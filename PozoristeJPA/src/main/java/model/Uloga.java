package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the Uloga database table.
 * 
 */
@Entity
@NamedQuery(name="Uloga.findAll", query="SELECT u FROM Uloga u")
public class Uloga implements Serializable {
	private static final long serialVersionUID = 1L;

	public Uloga() {
	}

}