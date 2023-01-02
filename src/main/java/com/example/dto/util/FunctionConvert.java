package com.example.dto.util;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * .
 *
 * @author YuanGeng
 * @since 2023/01/01 20:12
 */
public class FunctionConvert<V, V2> implements BiFunction<V, V2, V2> {
	
	@Override
	public V2 apply(V source, V2 target) {
		if (Optional.of(source).orElseThrow() instanceof List<?>) {
			String source1 = (String) source;
		}
		
		Optional.of(target).orElseThrow();
		return null;
	}
	
	@Override
	public <V1> BiFunction<V, V2, V1> andThen(Function<? super V2, ? extends V1> after) {
		return BiFunction.super.andThen(after);
	}
}
