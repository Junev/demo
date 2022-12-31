package com.example.mqtt.boot;

import com.example.mqtt.mapper.SiloMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SiloMessageService {
    @Autowired
    private SiloMessageMapper siloMessageMapper;

    public SiloMessageMapper getSiloMessageMapper() {
        return siloMessageMapper;
    }

    public void setSiloMessageMapper(SiloMessageMapper siloMessageMapper) {
        this.siloMessageMapper = siloMessageMapper;
    }
}
