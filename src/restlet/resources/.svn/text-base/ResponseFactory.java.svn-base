package restlet.resources;

import java.util.HashMap;
import java.util.Map;

import org.restlet.ext.json.JsonRepresentation;


public class ResponseFactory {
	public JsonRepresentation getJsonRepresentation(int errorcode, Object msgObject) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("retcode", errorcode);
		map.put("data", msgObject);
		return new JsonRepresentation(map);
	}
}
