package com.example.services;

import com.example.models.Time;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/time")
@Produces(MediaType.APPLICATION_JSON)
public class TimeService {

    @GET
    public Time get(@Context HttpServletRequest req) {
    	Time time = new Time();
    	System.out.println("{ \"year\": " + time.getYear() +
    						", \"month\": " + time.getMonth() +
    						", \"day\": " + time.getDay() +
    						", \"hour\": " + time.getHour() +
    						", \"minute\": " + time.getMinute() +
    						", \"ip\": \"" + req.getRemoteAddr() +"\"}");
        return time;
    }

}

