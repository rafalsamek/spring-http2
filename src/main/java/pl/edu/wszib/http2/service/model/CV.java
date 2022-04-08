package pl.edu.wszib.http2.service.model;

import org.springframework.format.annotation.DateTimeFormat;
import pl.edu.wszib.http2.service.common.CrudResource;

import java.util.List;

public class CV implements CrudResource<Integer> {

  private Integer id;
  private String imie;
  private String nazwisko;
  @DateTimeFormat(pattern = "yyyy-MD-dd")
  private String dataUrodzenia;
  private byte[] zdjecie;
  private List<Praca> doswiadczenie;
  private List<Kompetencja> kompetencje;

  @Override
  public Integer getId() {
    return id;
  }

  @Override
  public void setId(Integer id) {
    this.id = id;
  }

  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public String getDataUrodzenia() {
    return dataUrodzenia;
  }

  public void setDataUrodzenia(String dataUrodzenia) {
    this.dataUrodzenia = dataUrodzenia;
  }

  public byte[] getZdjecie() {
    return zdjecie;
  }

  public void setZdjecie(byte[] zdjecie) {
    this.zdjecie = zdjecie;
  }

  public List<Praca> getDoswiadczenie() {
    return doswiadczenie;
  }

  public void setDoswiadczenie(List<Praca> doswiadczenie) {
    this.doswiadczenie = doswiadczenie;
  }

  public List<Kompetencja> getKompetencje() {
    return kompetencje;
  }

  public void setKompetencje(List<Kompetencja> kompetencje) {
    this.kompetencje = kompetencje;
  }
}
