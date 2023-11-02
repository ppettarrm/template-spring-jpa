package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the Zanr database table.
 * 
 */
@Entity
@NamedQuery(name="Zanr.findAll", query="SELECT z FROM Zanr z")
public class Zanr implements Serializable {
	private static final long serialVersionUID = 1L;

	public Zanr() {
	}

}