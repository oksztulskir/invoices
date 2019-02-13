package pl.inforaf.invoices.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.inforaf.invoices.domain.entity.UserEntity;

/**
 * Created by Rafał on 2017-01-25.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
