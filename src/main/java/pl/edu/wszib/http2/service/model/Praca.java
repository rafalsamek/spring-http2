package pl.edu.wszib.http2.service.model;

public class Praca {
  private long id;
  private String nazwaFirmy;
  private String pracaOd;
  private String pracaDo;
  private String stanowisko;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNazwaFirmy() {
    return nazwaFirmy;
  }

  public void setNazwaFirmy(String nazwaFirmy) {
    this.nazwaFirmy = nazwaFirmy;
  }

  public String getPracaOd() {
    return pracaOd;
  }

  public void setPracaOd(String pracaOd) {
    this.pracaOd = pracaOd;
  }

  public String getPracaDo() {
    return pracaDo;
  }

  public void setPracaDo(String pracaDo) {
    this.pracaDo = pracaDo;
  }

  public String getStanowisko() {
    return stanowisko;
  }

  public void setStanowisko(String stanowisko) {
    this.stanowisko = stanowisko;
  }
}
