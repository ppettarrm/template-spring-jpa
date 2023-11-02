package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the Karta database table.
 * 
 */
@Entity
@NamedQuery(name="Karta.findAll", query="SELECT k FROM Karta k")
public class Karta implements Serializable {
	private static final long serialVersionUID = 1L;

	public Karta() {
	}

}