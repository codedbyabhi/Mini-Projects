package com.mini.onlineCourseFeedbak;
import java.util.*;

class Design{
	   String name;
	   String courseName; 
	   float rating;
	   String feedback;

	   public Design(String name, String courseName, float rating, String feedback){
	    this.name=name;
	    this.courseName=courseName;
	    this.rating=rating;
	    this.feedback=feedback;
	   }

	    void displayFeedback(){
	        System.out.println("Thank you, "+name+"!");
	        System.out.println("Course: "+courseName);
	        System.out.println("Rating: "+rating+" / 5");
	        System.out.println("Feedback: "+feedback);
	    }

	}