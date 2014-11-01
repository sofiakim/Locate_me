package com.example.locateme;
import java.awt.*;

public class Event {
	private String eventname;
	private String eventdescription;
	private String date;
	private String time;
	
	public Event (String name, String description, String date, String time){
		this.eventname = name;
		this.eventdescription = description;
		this.date = date;
		this.time = time;
	}
	
	public String toString()
	{
		return String.format("%s , %s , %s", this.eventname, this.date, this.time);
	}
}
