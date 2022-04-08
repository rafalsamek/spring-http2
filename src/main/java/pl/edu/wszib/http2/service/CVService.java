package pl.edu.wszib.http2.service;

import org.springframework.stereotype.Service;
import pl.edu.wszib.http2.service.common.CrudService;
import pl.edu.wszib.http2.service.model.CV;

@Service
public class CVService extends CrudService<CV, Integer> {
  public CVService() {
    super(Integer.class);
  }
}
