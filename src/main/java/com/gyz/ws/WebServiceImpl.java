package com.gyz.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebServiceImpl implements IWebService {
	private static Logger logger = LoggerFactory.getLogger(WebServiceImpl.class);
	public String getTaskValue(String batchFlag) {
		//���ݿ⴦���߼�
		logger.info("���ݿ⴦���߼�");
		return batchFlag;
	}
	
	public static void main(String[] args) {
		WebServiceImpl ws = new WebServiceImpl();
		ws.getTaskValue("20161221001-3");
	}

}
