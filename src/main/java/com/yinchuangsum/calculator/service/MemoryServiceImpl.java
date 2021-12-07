package com.yinchuangsum.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class MemoryServiceImpl implements MemoryService {
    private double memoryValue;

    public MemoryServiceImpl() {
        this.memoryValue = 0;
    }

    @Override
    public double getMemoryValue() {
        return memoryValue;
    }

    @Override
    public void setMemoryValue(double value) {
        this.memoryValue = value;
    }
}
