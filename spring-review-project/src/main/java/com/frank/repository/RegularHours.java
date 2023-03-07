package com.frank.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RegularHours implements HoursRepository{
    @Override
    public int getHorus() {
        return 40;
    }
}
