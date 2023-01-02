package com.example.dto.conversion;

import com.example.dto.entity.differenttype.OneString;
import com.example.dto.dto.OneStringDto;
import entity.dto.ManyConvertImpl;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * .
 *
 * @author YuanGeng
 * @since 2022/12/31 16:23
 */
@Mapper(uses = ManyConvertImpl.class)
public interface OneStringConvert {
	
	@Mapping(source = "one", target = "one.name")
	OneString toOneString(OneStringDto oneStringDto);
	@Mapping(source = "one.name", target = "one")
	OneStringDto toOneStringDto(OneString oneString);
}
