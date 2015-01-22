package restlet.model;

import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import restlet.utils.ERRORCODE;

public class StorageStack {
	private static Logger logger = LogManager.getLogger(StorageStack.class.getName());
	private static HashMap<Integer, Student> students = new HashMap<Integer, Student>();
	/*static {
		Student stu = new Student();
		stu.setID(1);
		stu.setName("name001");
		stu.setSex(1);
		stu.setAge(24);
		students.put(stu.getID(), stu);
	}*/
	public static int addStudent(Student stu) {
		try {
			if (students.get(stu.getID()) == null) {
				students.put(stu.getID(), stu);
				return 0;
			} else {
				return ERRORCODE._10000002;
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
			return -1;
		}
		
	}
	public static int delStudent(int id) {
		try {
			if (students.get(id) != null) {
				students.remove(id);
				return 0;
			} else {
				return ERRORCODE._10000001;
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
			return -1;
		}
		
	}
	public static int updateStudent(Student stu) {
		try {
			if (students.get(stu.getID()) != null) {
				students.put(stu.getID(), stu);
				return 0;
			} else {
				return ERRORCODE._10000001;
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
			return -1;
		}
		
	}
	public static Student queryStudent(int id) {
		try {
			return students.get(id);
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
			return null;
		}
	}
}
