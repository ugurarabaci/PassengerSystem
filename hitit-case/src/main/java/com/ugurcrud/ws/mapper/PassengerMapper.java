package com.ugurcrud.ws.mapper;

import com.ugurcrud.ws.dto.PassengerDto;
import com.ugurcrud.ws.entity.Passenger;
import org.mapstruct.Mapper;

@Mapper
public interface PassengerMapper {

    PassengerDto toDto(Passenger entity);

    Passenger toEntity(PassengerDto dto);

}
