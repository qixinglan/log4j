package log4j_2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/*
 * log4j �ڶ���
 */
public class TestLog4j {
		private static Logger logger =(Logger) LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
		private static Logger logger2 =(Logger) LogManager.getLogger("com.mengdee.dao");
		public static void main(String[] args) {
			logger.debug("������Ϣ");
			logger.info("��ͨ��Ϣ");
			logger.warn("������Ϣ");
			logger.error("������Ϣ");
			logger.fatal("������Ϣ");
			logger2.debug("������Ϣ");
			logger2.info("��ͨ��Ϣ");
			logger2.warn("������Ϣ");
			logger2.error("������Ϣ");
			logger2.fatal("������Ϣ");
		}
}
