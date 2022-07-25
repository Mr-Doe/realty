package com.portfolio.realty.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter @Setter
@NoArgsConstructor
@Alias("itemVO")
public class ItemVO {
    private long itemId;
    private String headAddr;
    private String addrJibun;
    private String addrRoad;
    private int price;
    private long ownerId;

    // insert
    public ItemVO(String headAddr, String addrJibun, String addrRoad, int price, long ownerId) {
        this.headAddr = headAddr;
        this.addrJibun = addrJibun;
        this.addrRoad = addrRoad;
        this.price = price;
        this.ownerId = ownerId;
    }

    // list
    public ItemVO(long itemId, String headAddr, String addrJibun, String addrRoad, int price, long ownerId) {
        this.itemId = itemId;
        this.headAddr = headAddr;
        this.addrJibun = addrJibun;
        this.addrRoad = addrRoad;
        this.price = price;
        this.ownerId = ownerId;
    }

    // update
    public ItemVO(long itemId, String headAddr, String addrJibun, String addrRoad, int price) {
        this.itemId = itemId;
        this.headAddr = headAddr;
        this.addrJibun = addrJibun;
        this.addrRoad = addrRoad;
        this.price = price;
    }
}
