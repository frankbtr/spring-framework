package com.frank.entity;

import com.frank.enums.MovieState;
import com.frank.enums.MovieType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Movie extends BaseEntity{

    private String name;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    private Integer duration;
    @Column(columnDefinition = "text")
    private String summary;
    @Enumerated(EnumType.STRING)
    private MovieType type;
    @Enumerated(EnumType.STRING)
    private MovieState state;
    private BigDecimal price;
}
