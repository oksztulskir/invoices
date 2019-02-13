package pl.inforaf.invoices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pl.inforaf.invoices.domain.entity.UserEntity;
import pl.inforaf.invoices.domain.repository.UserRepository;
import pl.inforaf.invoices.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Rafał on 2017-01-25.
 */
@Service
public class UserServiceImpl implements UserService {
    private static Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity findById(Long id) {
        return userRepository.findOne(id);
    }
}
