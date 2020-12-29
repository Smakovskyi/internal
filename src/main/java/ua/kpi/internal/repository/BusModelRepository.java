package ua.kpi.internal.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import ua.kpi.internal.entities.BusModel;

@Repository
public interface BusModelRepository extends ReactiveCrudRepository<BusModel, Long> {

  Mono<BusModel> findByModel(String name);
}
