package pl.edu.wszib.http2.service.model;

public class Kompetencja {

  private Integer id;
  private KompetencjaRodzaj rodzaj;
  private String nazwa;
  private Integer stopien = 0;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public KompetencjaRodzaj getRodzaj() {
    return rodzaj;
  }

  public void setRodzaj(KompetencjaRodzaj rodzaj) {
    this.rodzaj = rodzaj;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public Integer getStopien() {
    return stopien;
  }

  public void setStopien(Integer stopien) {
    this.stopien = stopien;
  }
}
