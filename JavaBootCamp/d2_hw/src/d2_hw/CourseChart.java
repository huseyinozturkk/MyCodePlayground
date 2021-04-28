package d2_hw;

public class CourseChart {
	
	public CourseChart(int courseDay,String dayDetail,String recordedVideoLink,String homework,String rating) {
		this.courseDay = courseDay;
		this.dayDetail = dayDetail;
		this.recordedVideoLink = recordedVideoLink;
		this.homework = homework;
		this.rating = rating;
	}

	int courseDay;
	String dayDetail;
	String recordedVideoLink;
	String homework;
	String rating;
	String userCommentsDayDetail;
	String userCommentsRecordedVideoLink;
	String userCommentsHomework;
	String userCommentsRating;
	
}
