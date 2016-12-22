package mvcdemo;

import java.rmi.RemoteException;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.gyz.ws.IWebService;

public class WSTest {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean soapFactoryBean = new JaxWsProxyFactoryBean();
        soapFactoryBean.setAddress("http://localhost:8080/mvcdemo/webservice/testService"); 
        Object o = soapFactoryBean.create();
        IWebService userService = (IWebService)o;
        String s;
			s = userService.getTaskValue("20161221002-3");
			 System.out.println("return value:"+s);
       

	}

}
