package uk.co.mavisto.scorecard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Course table in database
 */
@Entity
@Table(name = "COURSE")
public class Course {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="courseName")
	String courseName;
	
	@Column(name="courseLocation")
	String courseLocation;
}
