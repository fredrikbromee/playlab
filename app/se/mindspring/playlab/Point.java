package se.mindspring.playlab;


public class Point {

	private final double lon;
	private final double lat;

	public Point(double xLong, double yLat) {
		if (xLong < -180 || xLong > 180) {
			throw new RuntimeException("Not a valid longitude:" + xLong);
		}
		if (yLat < -90 || yLat > 90) {
			throw new RuntimeException("Not a valid latitude:" + yLat);
		}

		this.lon = xLong;
		this.lat = yLat;
	}

	public double getLon() {
		return lon;
	}

	public double getLat() {
		return lat;
	}
}
