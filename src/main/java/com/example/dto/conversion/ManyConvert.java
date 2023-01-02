package com.example.dto.conversion;

import com.example.dto.dto.ManyDto;
import com.example.dto.entity.Many;
import org.mapstruct.Mapper;

/**
 * .
 *
 * @author YuanGeng
 * @since 2022/12/31 20:15
 */
@Mapper
public interface ManyConvert {
	
	Many toMany(ManyDto manyDto);

	ManyDto toManyDto(Many many);
}
