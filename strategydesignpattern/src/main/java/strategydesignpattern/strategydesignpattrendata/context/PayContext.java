package strategydesignpattern.strategydesignpattrendata.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import strategydesignpattern.strategydesignpattrendata.dto.PayDataDto;
import strategydesignpattern.strategydesignpattrendata.mapper.PayMapper;
import strategydesignpattern.strategydesignpattrendata.pay.Pay;
import strategydesignpattern.strategydesignpattrendata.utils.SpringUtils;

@Component
public class PayContext {

    @Autowired
    private PayMapper payMapper;

    public String pay(String payCode,String account,String payPassword){
        if(StringUtils.isEmpty(payCode)){
            return "支付方式不能为空！";
        }
        PayDataDto payDto =payMapper.getPayMethod(payCode);
        if(null == payDto){
            return "请检查是否开启该支付方式！";
        }
        String payMethod = payDto.getPayMethod();
        if(StringUtils.isEmpty(payMethod)){
            return "支付方式为空！";
        }
        Pay pay =SpringUtils.getBean(payMethod, Pay.class);
        if(null == pay){
            return "系统错误！";
        }
        return pay.pay(account,payPassword);

    }
}
