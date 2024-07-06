package jss.nursingmap.repository.sample;

import jss.nursingmap.domain.sample.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {
}
