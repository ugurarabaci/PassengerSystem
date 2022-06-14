package com.ugurcrud.ws.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {
    private Integer id;
    private Integer passengerId;
    private Integer flightId;
}
