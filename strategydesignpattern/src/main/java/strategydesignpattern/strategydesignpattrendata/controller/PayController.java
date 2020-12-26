package strategydesignpattern.strategydesignpattrendata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import strategydesignpattern.strategydesignpattrendata.context.PayContext;

@RestController
public class PayController {

    @Autowired
    private PayContext payContext;

    @RequestMapping("pay")
    @ResponseBody
    public String pay(@RequestParam(value = "payCode") String payCode,@RequestParam(value = "account") String account,@RequestParam(value = "payPassword") String payPassword){
        return payContext.pay(payCode,account,payPassword);
    }
}
