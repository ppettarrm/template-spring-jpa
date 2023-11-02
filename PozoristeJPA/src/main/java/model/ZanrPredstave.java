package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the ZanrPredstave database table.
 * 
 */
@Entity
@NamedQuery(name="ZanrPredstave.findAll", query="SELECT z FROM ZanrPredstave z")
public class ZanrPredstave implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZanrPredstave() {
	}

}