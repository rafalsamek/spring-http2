package pl.edu.wszib.http2.service.common;

public interface CrudResource<ID> {

  ID getId();

  void setId(ID id);

}
