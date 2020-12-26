package strategydesignpattern.strategydesignpattrendata.dto;


import lombok.Data;

@Data
public class PayDataDto {
    private String payCode;
    private String payMethod;
    private String payOnOff;
}
