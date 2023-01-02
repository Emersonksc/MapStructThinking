package com.example.dto.entity.differenttype;

import com.example.dto.entity.Many;
import com.example.dto.entity.One;
import java.util.List;
import lombok.Data;

/**
 * .
 *
 * @author YuanGeng
 * @since 2022/12/31 16:17
 */
@Data
public class OneString {
	
	private List<Many> many;
	
	private One one;
}
