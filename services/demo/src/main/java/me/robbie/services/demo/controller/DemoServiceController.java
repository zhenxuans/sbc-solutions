package me.robbie.services.demo.controller;


import me.robbie.services.demo.api.DemoService;
import me.robbie.services.demo.model.BaseResponse;
import me.robbie.services.demo.model.DemoRequestData;
import me.robbie.services.demo.model.DemoResponseData;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServiceController implements DemoService {
    @Override
    public BaseResponse<DemoResponseData> getDemoData(DemoRequestData req) {
        BaseResponse<DemoResponseData> resp = new BaseResponse();
        resp.setCode("200");
        resp.setMessage("OK");
        resp.setReqNo("12345");
        DemoResponseData data = new DemoResponseData();
        data.setValueStr("hello spring cloud.");
        resp.setDataBody(data);
        return resp;
    }

    @Override
    public BaseResponse<DemoResponseData> setDemoData(DemoRequestData req) {
        BaseResponse<DemoResponseData> resp = new BaseResponse();
        resp.setCode("300");
        resp.setMessage("FAIL");
        resp.setReqNo("23456");
        DemoResponseData data = new DemoResponseData();
        data.setValueStr("hello spring cloud.");
        resp.setDataBody(data);
        return resp;
    }
}
