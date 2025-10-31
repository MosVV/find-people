package com.example.find_people.user.dto.response;

import com.example.find_people.user.entity.UserEntity;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;

    public static UserResponse of(UserEntity item){
        return UserResponse.builder()
                .id(item.getId())
                .firstName(item.getFirstName())
                .lastName(item.getLastName())
                .build();
    }
}
