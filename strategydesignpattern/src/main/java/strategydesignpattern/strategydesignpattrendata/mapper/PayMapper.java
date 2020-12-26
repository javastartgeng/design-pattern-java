package strategydesignpattern.strategydesignpattrendata.mapper;

import org.apache.ibatis.annotations.Select;
import strategydesignpattern.strategydesignpattrendata.dto.PayDataDto;

public interface PayMapper {

    @Select("SELECT * FROM PAY_METHOD WHERE PAY_CODE = #{payCode} AND PAY_ON_OFF = 'true'")
    PayDataDto getPayMethod(String payCode);
}
