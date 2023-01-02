package com.example.dto.dto;

import java.util.List;
import lombok.Data;

/**
 * .
 *
 * @author YuanGeng
 * @since 2022/12/31 16:18
 */
@Data
public class OneStringDto {
	
	private List<ManyDto> many;
	
	private String one;
}
