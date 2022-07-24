package com.portfolio.realty.domain;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Getter @Setter
@NoArgsConstructor
@Alias("userVO")
public class UserVO {
    private long userId;
    private String email;
    private String nickName;
    private String name;

    public UserVO(String email, String nickName, String name) {
        this.email = email;
        this.nickName = nickName;
        this.name = name;
    }

    public UserVO(long userId, String nickName, String name) {
        this.userId = userId;
        this.nickName = nickName;
        this.name = name;
    }
}

