package com.yinchuangsum.calculator.controller;

import com.yinchuangsum.calculator.model.CalculatorResponse;
import com.yinchuangsum.calculator.model.Operation;
import com.yinchuangsum.calculator.service.MemoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OperationController {

    private final MemoryService memoryService;

    @GetMapping("/addition")
    @ResponseBody
    public CalculatorResponse addition(@RequestParam double input) {
        double memoryValue = memoryService.getMemoryValue();
        double result = memoryValue + input;
        memoryService.setMemoryValue(result);
        return new CalculatorResponse(Operation.ADDITION, memoryValue, input, result);
    }

    @GetMapping("/subtraction")
    @ResponseBody
    public CalculatorResponse subtraction(@RequestParam double input) {
        double memoryValue = memoryService.getMemoryValue();
        double result = memoryValue - input;
        memoryService.setMemoryValue(result);
        return new CalculatorResponse(Operation.SUBTRACTION, memoryValue, input, result);
    }

    @GetMapping("/multiplication")
    @ResponseBody
    public CalculatorResponse multiplication(@RequestParam double input) {
        double memoryValue = memoryService.getMemoryValue();
        double result = memoryValue * input;
        memoryService.setMemoryValue(result);
        return new CalculatorResponse(Operation.MULTIPLICATION, memoryValue, input, result);
    }

    @GetMapping("/division")
    @ResponseBody
    public CalculatorResponse division(@RequestParam double input) {
        double memoryValue = memoryService.getMemoryValue();
        double result = memoryValue / input;
        memoryService.setMemoryValue(result);
        return new CalculatorResponse(Operation.DIVISION, memoryValue, input, result);
    }

    @GetMapping("/memoryValue")
    @ResponseBody
    public CalculatorResponse getMemoryValue() {
        double memoryValue = memoryService.getMemoryValue();
        return new CalculatorResponse(Operation.NULL, memoryValue, null, memoryValue);
    }
}
