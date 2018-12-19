package me.robbie.services.demo;


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
