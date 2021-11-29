package com.epam.izh.rd.online.autcion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

/**
 * Ставка
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bid {
    private Long bidId;
    private LocalDate bidDate;
    private Double bidValue;
    private Long itemId;
    private Long userId;
}
