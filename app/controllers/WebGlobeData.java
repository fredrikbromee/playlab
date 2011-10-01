package controllers;

import java.util.ArrayList;
import java.util.List;

import se.mindspring.playlab.Point;

public class WebGlobeData {

	List<Double> values = new ArrayList<Double>();

	public WebGlobeData(List<Point> points) {
		for (Point point : points) {
			values.add(point.getLon());
			values.add(point.getLat());

			// magnitude
			values.add(0.5);
		}
	}

	public ArrayList<Object> theWholeShebang() {
		ArrayList<Object> series = new ArrayList<Object>();
		series.add("name of series");
		series.add(values);
		ArrayList<Object> global = new ArrayList<Object>();
		global.add(series);
		return global;
	}
}
