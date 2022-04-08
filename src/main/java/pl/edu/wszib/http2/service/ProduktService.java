package pl.edu.wszib.http2.service;

import org.springframework.stereotype.Service;
import pl.edu.wszib.http2.service.common.CrudService;
import pl.edu.wszib.http2.service.model.CV;
import pl.edu.wszib.http2.service.model.Produkt;

@Service
public class ProduktService extends CrudService<Produkt, Integer> {
  public ProduktService() {
    super(Integer.class);
  }
}
