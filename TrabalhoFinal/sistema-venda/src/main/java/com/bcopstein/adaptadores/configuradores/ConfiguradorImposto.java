package com.bcopstein.adaptadores.configuradores;

import com.bcopstein.aplicacao.servicos.ICalculoImposto;
import com.bcopstein.aplicacao.servicos.ImpostoOriginal;
import com.bcopstein.aplicacao.servicos.ImpostoComprasGrandes;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguradorImposto {

  @Bean
  @ConditionalOnProperty(name = "venda.imposto", havingValue = "original", matchIfMissing = true)
  public ICalculoImposto opcaoPaisBrasil() {
    return new ImpostoOriginal();
  }

  @Bean
  @ConditionalOnProperty(name = "venda.imposto", havingValue = "grandes")
  public ICalculoImposto opcaoPaisChile() {
    return new ImpostoComprasGrandes();
  }
}