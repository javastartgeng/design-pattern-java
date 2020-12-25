package strategydesignpattern.strategydesginpatternSpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import strategydesignpattern.strategydesginpatternSpringboot.context.Context;
import strategydesignpattern.strategydesginpatternSpringboot.payEnum.PayEnum;

@RestController
public class StrategyPayController {

    @Autowired
    private Context context;

    @RequestMapping("/pay")
    @ResponseBody
    public String pay(){
        //微信支付
        context.pay(PayEnum.WECHATPAY).pay("flyFish","123456");
        //支付宝支付
        context.pay(PayEnum.ZHIFUBAOPAY).pay("guessMe","111111");
        return "success";
    }
}
