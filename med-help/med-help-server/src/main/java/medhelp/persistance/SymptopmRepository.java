package medhelp.persistance;

import medhelp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptopmRepository extends JpaRepository<User, Long> {
}
