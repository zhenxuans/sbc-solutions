package me.robbie.services.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/demo")
public interface DemoService {
    @RequestMapping(value= "/getDemo", method = RequestMethod.GET)
    BaseResponse<DemoResponseData> getDemoData(@RequestBody DemoRequestData req);

    @RequestMapping(value = "/setDemo", method = RequestMethod.POST)
    BaseResponse<DemoResponseData> setDemoData(@RequestBody DemoRequestData req);
}
