package org.baost.juntisimo.domain.block;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@MappedSuperclass
public abstract class BaseBlockEntity {
    @NotNull
    private String blockReason;
    @NotNull
    private LocalDate blockDate;
}
