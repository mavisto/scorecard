package uk.co.mavisto.scorecard.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;
import uk.co.mavisto.scorecard.controller.CourseController;

public class TestCourse extends TestCase {
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	public void testCourseControllerObjectCreated() {
		CourseController testCourseController = new CourseController();
		
		for(int i = 1; i <= testCourseController.getCourseHoleMap().size(); i++) {
			System.out.println("The course object is " + testCourseController.getCourseHoleMap().get(i).getNumber());
		}
	}

}
