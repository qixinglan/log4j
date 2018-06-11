package log4j_2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/*
 * log4j 第二代
 */
public class TestLog4j {
		private static Logger logger =(Logger) LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
		private static Logger logger2 =(Logger) LogManager.getLogger("com.mengdee.dao");
		public static void main(String[] args) {
			logger.debug("调试信息");
			logger.info("普通信息");
			logger.warn("警告信息");
			logger.error("错误信息");
			logger.fatal("致命信息");
			logger2.debug("调试信息");
			logger2.info("普通信息");
			logger2.warn("警告信息");
			logger2.error("错误信息");
			logger2.fatal("致命信息");
		}
}
