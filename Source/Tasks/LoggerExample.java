package Tasks;

import org.apache.log4j.Logger;

public class LoggerExample {
	
	 // get a logger instance
		public static Logger logger = Logger.getLogger(LoggerExample.class);

		public void testLoggerDebug(String str) {
			logger.debug(str);
		}

		public void testLoggerInfo() {
			logger.info("Hello.. im in Info method");
		}

		public void testLoggerWarn() {
			logger.warn("Hello.. im in Warn method");
		}

		public void testLoggerError() {
			logger.error("Hello.. im in Error method");
		}

		public void testLoggerFatal() {
			logger.fatal("Hello.. im in Fatal method");
		}

		public static void loger(String str)
		{
			LoggerExample example = new LoggerExample();
			example.testLoggerDebug(str);
//			example.testLoggerInfo();
//			example.testLoggerWarn();
//			example.testLoggerError();
//			example.testLoggerFatal();
		}

}
