package pl.edu.wszib.http2.service;

import org.springframework.stereotype.Service;
import pl.edu.wszib.http2.service.common.CrudService;
import pl.edu.wszib.http2.service.model.Profile;

@Service
public class ProfileService extends CrudService<Profile, Integer> {
  public ProfileService() {
    super(Integer.class);
  }
}
