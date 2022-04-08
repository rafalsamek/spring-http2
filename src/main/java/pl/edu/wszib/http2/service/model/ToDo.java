package pl.edu.wszib.http2.service.model;

import pl.edu.wszib.http2.service.common.CrudResource;

public class ToDo implements CrudResource<Integer> {

  private Integer id;
  private String zadanie;
  private ToDoStatus status;
  private String termin;

  @Override
  public Integer getId() {
    return id;
  }

  @Override
  public void setId(Integer integer) {
    this.id = integer;
  }

  public String getZadanie() {
    return zadanie;
  }

  public void setZadanie(String zadanie) {
    this.zadanie = zadanie;
  }

  public ToDoStatus getStatus() {
    return status;
  }

  public void setStatus(ToDoStatus status) {
    this.status = status;
  }

  public String getTermin() {
    return termin;
  }

  public void setTermin(String termin) {
    this.termin = termin;
  }
}
