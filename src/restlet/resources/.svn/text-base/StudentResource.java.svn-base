package restlet.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Post;

import restlet.model.StorageStack;
import restlet.model.Student;
import restlet.utils.ERRORCODE;

@Path("/restlet/student/")
public class StudentResource {
	private static Logger logger = LogManager.getLogger(StudentResource.class.getName());
	@POST
	@Post("json")
	@Path("add")
	@Produces("application/json")
	public Representation addStudent(JsonRepresentation entity) {
		ResponseFactory responseFactory = new ResponseFactory();
		Representation response = null;
		try {
			JSONObject jsonobject = entity.getJsonObject();
			logger.info("recv request data : " + jsonobject.toString());
			int id = jsonobject.getInt("id");
			String name = jsonobject.getString("name");
			int sex = jsonobject.getInt("sex");
			int age = jsonobject.getInt("age");
			Student stu = new Student();
			stu.setID(id);
			stu.setName(name);
			stu.setSex(sex);
			stu.setAge(age);
			int retcode = StorageStack.addStudent(stu);
			response = responseFactory.getJsonRepresentation(retcode, null);
			logger.info("send response data : " +response.getText());
			return response;
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
			response = responseFactory.getJsonRepresentation(ERRORCODE._1, null);
			return response;
		}
	}
	@GET
	@Path("query/id/{id}")
	@Produces("application/json")
	public Representation queryStudent(@PathParam("id") int id) {
		ResponseFactory responseFactory = new ResponseFactory();
		Representation response = null;
		try {
			logger.info("recv request data : " + String.valueOf(id));
			Student stu = StorageStack.queryStudent(id);
			if(stu == null) {
				response = responseFactory.getJsonRepresentation(ERRORCODE._10000001, null);
			} else {
				response = responseFactory.getJsonRepresentation(ERRORCODE._0, stu);
			}
			logger.info("send response data : " + response.getText());
			return response;
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
			return responseFactory.getJsonRepresentation(ERRORCODE._1, null);
		}
	}
}
