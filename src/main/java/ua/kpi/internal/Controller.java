package ua.kpi.internal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.kpi.internal.entities.Bus;
import ua.kpi.internal.entities.BusModel;
import ua.kpi.internal.repository.BusModelRepository;
import ua.kpi.internal.repository.BusRepository;

@RestController
@RequestMapping("/api")
public class Controller {
  @Autowired
  private BusRepository busRepository;

  @Autowired
  private BusModelRepository busModelRepository;

  @GetMapping("/bus-model")
  public Flux<BusModel> getBusModels(){
    return busModelRepository.findAll();
  }

  @GetMapping("/bus-model/{model}")
  public Mono<BusModel> getBusModel(@PathVariable("model") String  model){
    return busModelRepository.findByModel(model);
  }

  @GetMapping("/buses")
  public Flux<Bus> getAllBuses(){
    return busRepository.findAll();
  }

  @GetMapping("/buses/{model}")
  public Flux<Bus> getBusesByModel(@PathVariable("model") String  model){
    return busRepository.findWithModelName(model);
  }


}
