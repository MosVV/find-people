package com.example.find_people.user.service;

import com.example.find_people.user.entity.UserEntity;
import com.example.find_people.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final NameGenerator nameGenerator;

    public boolean init() {
        userRepository.deleteAll();

        int repet = 10, dataPerLoop = 1000;

        for (int i = 0; i < repet; i++) {

            List<UserEntity> all = new ArrayList<>();
            for (int dataIndex = 0; dataIndex < dataPerLoop; dataIndex++) {
                NameGenerator.Name name = nameGenerator.generate();
                UserEntity user = UserEntity.builder()
                        .lastName(name.getLastName())
                        .firstName(name.getFirstName())
                        .build();
                all.add(user);
            }
            userRepository.saveAll(all);
        }
        return true;
    }
}
