package uk.co.mavisto.scorecard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Hole table in database
 */
@Entity
@Table(name = "HOLE")
public class Hole {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;

	@Column(name = "number")
	int holeNumber;

	@Column(name = "length")
	int holeLength;

	@Column(name = "par")
	int holePar;

	enum TeeColour {
		RED, YELLOW, WHITE
	}

	@Column(name = "teeColour")
	TeeColour teeColour;

	public Hole(int course_id, int i) {
		this.holeNumber = i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return holeNumber;
	}

	public void setNumber(int number) {
		this.holeNumber = number;
	}

	public int getLength() {
		return holeLength;
	}

	public void setLength(int length) {
		this.holeLength = length;
	}

	public int getPar() {
		return holePar;
	}

	public void setPar(int par) {
		this.holePar = par;
	}

}