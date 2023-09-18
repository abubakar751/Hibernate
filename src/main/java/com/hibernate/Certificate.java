package com.hibernate;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String course;
	private String courseDuration;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "Private [course=" + course + ", courseDuration=" + courseDuration + "]";
	}
}
