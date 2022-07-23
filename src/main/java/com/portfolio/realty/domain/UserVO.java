package com.portfolio.realty.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("userVO")
public class UserVO {
    private long userId;
    private String email;
    private String nickName;
    private String name;

}

