package az.edu.turing.bankingapplication.domain.repository;

import az.edu.turing.bankingapplication.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
