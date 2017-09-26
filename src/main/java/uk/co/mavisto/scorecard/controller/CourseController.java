package uk.co.mavisto.scorecard.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Controller;

import uk.co.mavisto.scorecard.model.Hole;

@Controller
public class CourseController {
	
	Map<Integer, Hole> courseHoleMap = new TreeMap<Integer, Hole>();
	
	public CourseController() {
		for(int i = 1; i <= 18; i++) {
			courseHoleMap.put(i, new Hole(i));
		}
	}

	public Map<Integer, Hole> getCourseHoleMap() {
		return courseHoleMap;
	}

	public void setCourseHoleMap(Map<Integer, Hole> courseHoleMap) {
		this.courseHoleMap = courseHoleMap;
	}

}
