package controllers;

import java.util.concurrent.CopyOnWriteArrayList;

import play.Logger;
import play.mvc.Controller;

import se.mindspring.playlab.Point;

/**
 * Next steps:
 * 
 * - show the visits on a globe - store the visits in a db
 * 
 * @author fredrikbromee
 * 
 */
public class Application extends Controller {


	private static CopyOnWriteArrayList<Point> visitors = new CopyOnWriteArrayList<Point>();

	public static void index() {
        render();
    }

	public static void enterPos(double lon, double lat) {
		Logger.info("Received pos lon %s, lat %s", lon, lat);
		Point point = new Point(lon, lat);
		visitors.add(point);
		view();
	}

	public static void view() {
		render();
	}

	public static void getStats() {
		// det är inte ett objekt. Det är en array av arrayer. Inte snyggt.
		WebGlobeData webGlobeData = new WebGlobeData(visitors);
		renderJSON(webGlobeData.theWholeShebang());
	}
}