package com.gyz.ws;

import javax.jws.WebService;

@WebService
public interface IWebService{
    public String getTaskValue(String batchFlag);
}
