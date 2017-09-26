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
	long number;

	@Column(name = "length")
	long length;

	@Column(name = "par")
	long par;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public long getPar() {
		return par;
	}

	public void setPar(long par) {
		this.par = par;
	}

}