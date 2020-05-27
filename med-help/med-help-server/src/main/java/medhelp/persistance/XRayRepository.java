package medhelp.persistance;

import medhelp.model.XRay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XRayRepository extends JpaRepository<XRay, Long> {
}
