package com.ugurcrud.ws.mapper;

import com.ugurcrud.ws.dto.PassengerDto;
import com.ugurcrud.ws.entity.Passenger;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-13T01:42:13+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
public class PassengerMapperImpl implements PassengerMapper {

    @Override
    public PassengerDto toDto(Passenger entity) {
        if ( entity == null ) {
            return null;
        }

        PassengerDto passengerDto = new PassengerDto();

        passengerDto.setId( entity.getId() );
        passengerDto.setFirstname( entity.getFirstname() );
        passengerDto.setLastname( entity.getLastname() );
        passengerDto.setPhone( entity.getPhone() );
        passengerDto.setEmail( entity.getEmail() );
        passengerDto.setAge( entity.getAge() );

        return passengerDto;
    }

    @Override
    public Passenger toEntity(PassengerDto dto) {
        if ( dto == null ) {
            return null;
        }

        Passenger passenger = new Passenger();

        passenger.setId( dto.getId() );
        passenger.setFirstname( dto.getFirstname() );
        passenger.setLastname( dto.getLastname() );
        passenger.setAge( dto.getAge() );
        passenger.setPhone( dto.getPhone() );
        passenger.setEmail( dto.getEmail() );

        return passenger;
    }
}
