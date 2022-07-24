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
    private String activated;
    private long myCondition;

    // insert
    public ConditionVO(String presetName, String addrDo, String addrSi, String addrGu, String addrDong, String addrDaero, String addrRemain, int budget, long myCondition) {
        this.presetName = presetName;
        this.addrDo = addrDo;
        this.addrSi = addrSi;
        this.addrGu = addrGu;
        this.addrDong = addrDong;
        this.addrDaero = addrDaero;
        this.addrRemain = addrRemain;
        this.budget = budget;
        this.myCondition = myCondition;
    }

    // list
    public ConditionVO(long conditionId, String presetName, int budget, long myCondition) {
        this.conditionId = conditionId;
        this.presetName = presetName;
        this.budget = budget;
        this.myCondition = myCondition;
    }

    // detail
    public ConditionVO(long conditionId, String presetName, String addrDo, String addrSi, String addrGu, String addrDong, String addrDaero, String addrRemain, int budget, String activated, long myCondition) {
        this.conditionId = conditionId;
        this.presetName = presetName;
        this.addrDo = addrDo;
        this.addrSi = addrSi;
        this.addrGu = addrGu;
        this.addrDong = addrDong;
        this.addrDaero = addrDaero;
        this.addrRemain = addrRemain;
        this.budget = budget;
        this.activated = activated;
        this.myCondition = myCondition;
    }

    // update
    public ConditionVO(long conditionId, String presetName, String addrDo, String addrSi, String addrGu, String addrDong, String addrDaero, String addrRemain, int budget) {
        this.conditionId = conditionId;
        this.presetName = presetName;
        this.addrDo = addrDo;
        this.addrSi = addrSi;
        this.addrGu = addrGu;
        this.addrDong = addrDong;
        this.addrDaero = addrDaero;
        this.addrRemain = addrRemain;
        this.budget = budget;
    }

}