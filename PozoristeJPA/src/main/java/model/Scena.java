package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the Scena database table.
 * 
 */
@Entity
@NamedQuery(name="Scena.findAll", query="SELECT s FROM Scena s")
public class Scena implements Serializable {
	private static final long serialVersionUID = 1L;

	public Scena() {
	}

}