package com.portfolio.realty.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter @Setter
@NoArgsConstructor
@Alias("conditionVO")
public class ConditionVO {
    private long conditionId;
    private String presetName;
    private String addrDo;
    private String addrSi;
    private String addrGu;
    private String addrDong;
    private String addrDaero;
    private String addrRemain;
    private int budget;
    private long myCondition;

}