package uk.co.mavisto.scorecard.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Controller;

import uk.co.mavisto.scorecard.model.Hole;

@Controller
public class CourseController {
	
	Map<Integer, Hole> courseHoleMap = new TreeMap<Integer, Hole>();
	int courseId;
	
	public CourseController() {
		for(int i = 1; i <= 18; i++) {
			courseHoleMap.put(i, new Hole(courseId, i));
		}
	}

	public Map<Integer, Hole> getCourseHoleMap() {
		return courseHoleMap;
	}

	public void setCourseHoleMap(Map<Integer, Hole> courseHoleMap) {
		this.courseHoleMap = courseHoleMap;
	}
	
	public Hole getHoleDetailsbyNumber(long number) {
		Hole holeDetails = courseHoleMap.get(number);
		return holeDetails;
	}

}
