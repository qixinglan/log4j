package log4j_1;

import org.apache.log4j.Logger;
/*
 * log4j ��һ��
 */

public class TestLog4j {
		private static Logger logger = Logger.getLogger(TestLog4j.class);
		
		//Logger logger1=Logger.getLogger(TestLog4j.class.getName()����
		//Logger logger=Logger.getLogger("TestLog4j.class");
		public static void main(String[] args) {
			logger.debug("������Ϣ");
			logger.info("��ͨ��Ϣ");
			logger.warn("������Ϣ");
			logger.error("������Ϣ");
			logger.fatal("������Ϣ");
		}
}
