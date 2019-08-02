package pl.inforaf.invoices.service;


import pl.inforaf.invoices.domain.entity.UserEntity;

import java.util.List;

/**
 * Created by Rafał on 2017-01-25.
 */
public interface UserService {
    UserEntity findById(Long id);

    UserEntity save(UserEntity user);

    List<UserEntity> getUsers();
}
