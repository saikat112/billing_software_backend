package billing.billingsoftware.repository;

import billing.billingsoftware.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<UserEntity, Long> {

     Optional<UserEntity> findByEmail(String email);
     Optional<UserEntity> findByUserId(String userId);

     String email(String email);
}
