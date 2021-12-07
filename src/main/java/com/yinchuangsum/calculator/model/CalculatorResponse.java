package com.yinchuangsum.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalculatorResponse {
    private Operation operation;
    private Double memory;
    private Double input;
    private Double result;
}
