package ua.kpi.internal.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import ua.kpi.internal.entities.Bus;

@Repository
public interface BusRepository extends ReactiveCrudRepository<Bus, Long> {

  @Query("SELECT bus.* FROM Bus INNER JOIN bus_model ON bus.bus_model_id = bus_model.id  WHERE bus_model.model = :model ")
  Flux<Bus> findWithModelName(@Param("model") String model);
}
