package com.crio.starter.exchange;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
// @AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class ResponseDto {

  private String message;

  public ResponseDto(String message) {
    this.message = message;
  }
}