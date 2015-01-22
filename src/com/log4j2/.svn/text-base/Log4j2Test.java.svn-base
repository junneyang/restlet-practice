package com.log4j2;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.helloworld.HelloWorld;
class RunnableTest implements Runnable {
	private static Logger logger = LogManager.getLogger(RunnableTest.class.getName());
	private int counter;
	private int pointer;
	public RunnableTest(int counter, int pointer) {
		// TODO Auto-generated constructor stub
		this.counter = counter;
		this.pointer = pointer;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.pointer; i++) {
			synchronized (this) {
				this.counter = this.counter - 1;
				logger.info(Thread.currentThread().getName() + " counter current value : " + this.counter);
			}
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
				logger.catching(e);
			}
		}
	}
}
public class Log4j2Test {
	private static Logger logger = LogManager.getLogger(Log4j2Test.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ERROR StatusLogger No log4j2 configuration file found. 
		 * Using default configuration: logging only errors to the console.
		 */
		//logger using
		for (int i = 0; i < 100; i++) {
			logger.trace("trace msg");
			logger.debug("debug msg");
			logger.info("info msg");
			logger.warn("warn msg");
			logger.error("error msg");
			logger.fatal("fatal msg");
		}
		//package com logging using
		HelloWorld h = new HelloWorld();
		h.LogStr("Hello, junneyang !!!");
		//multithread logging
		RunnableTest r = new RunnableTest(10, 5);
		List<Thread> th_list = new ArrayList<Thread>();
		int num = 2;
		for (int i = 0; i < num; i++) {
			th_list.add(new Thread(r, "thread-" + i));
		}
		for (int i = 0; i < th_list.size(); i++) {
			th_list.get(i).start();
		}
		try {
			for (int i = 0; i < th_list.size(); i++) {
				th_list.get(i).join();
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.catching(e);
		}
		//exception handler
		try {
			int a = 10/0;
			System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
			//logger.error(e, e.fillInStackTrace());
			logger.catching(e);
		}
	}

}
