package d2_hw;

public class CourseChartManager {
	
	public void addHomework(CourseChart[] courses,int courseDay,String homework) {
		if (courses[courseDay-1].homework.isEmpty()) {
			courses[courseDay-1].homework = homework; 
		}else {
			System.out.println("G�n:"+ courseDay + " i�in �dev zaten verilmi�.");
		}
	}
	
	public void makeComment(CourseChart courseChart,String type,String comment) {
		switch (type) {
		case "dayDetail": {
			courseChart.userCommentsDayDetail = comment; 
			break;
				}
		case "recordedVideoLink": {
			courseChart.userCommentsRecordedVideoLink = comment; 
			break;	
		 	}
		case "homework": {
			courseChart.userCommentsHomework = comment;
			break;
				}
		case "rating": {
			courseChart.userCommentsRating = comment; 
			break;	
				}
		}
	}

}