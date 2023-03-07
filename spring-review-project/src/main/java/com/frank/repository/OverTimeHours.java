package com.frank.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("OTH")
public class OverTimeHours implements HoursRepository{
    @Override
    public int getHorus() {
        return 15;
    }
}
