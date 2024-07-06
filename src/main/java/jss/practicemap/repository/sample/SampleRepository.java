package jss.practicemap.repository.sample;

import jss.practicemap.domain.sample.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {
}
