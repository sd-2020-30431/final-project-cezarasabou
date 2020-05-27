package medhelp.persistance;

import medhelp.model.Comorbidities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComorbiditiesRepository extends JpaRepository<Comorbidities, Long> {
}
