package com.bcopstein.adaptadores.controllers.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubtotalDTO {
  Integer codigo;
  Integer quantidade;

  public Integer getCodigo(){return codigo;}
  public Integer getQuantidade(){return quantidade;}
}