package com.ugurcrud.ws.mapper;

import com.ugurcrud.ws.dto.FlightDto;
import com.ugurcrud.ws.entity.Flight;
import org.mapstruct.Mapper;

@Mapper
public interface FlightMapper {
    FlightDto toDto(Flight entity);

    Flight toEntity(FlightDto dto);

}
