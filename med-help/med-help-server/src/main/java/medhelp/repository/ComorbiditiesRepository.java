package medhelp.repository;

import medhelp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComorbiditiesRepository extends JpaRepository<User, Long> {
}
