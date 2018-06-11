package log4j_1;

import org.apache.log4j.Logger;
/*
 * log4j 第一代
 */

public class TestLog4j {
		private static Logger logger = Logger.getLogger(TestLog4j.class);
		
		//Logger logger1=Logger.getLogger(TestLog4j.class.getName()）；
		//Logger logger=Logger.getLogger("TestLog4j.class");
		public static void main(String[] args) {
			logger.debug("调试信息");
			logger.info("普通信息");
			logger.warn("警告信息");
			logger.error("错误信息");
			logger.fatal("致命信息");
		}
}
