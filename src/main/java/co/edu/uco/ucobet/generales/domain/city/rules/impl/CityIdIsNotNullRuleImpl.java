package co.edu.uco.ucobet.generales.domain.city.rules.impl;

import java.util.UUID;

import co.edu.uco.ucobet.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.generales.domain.city.exceptions.CityIdIsNullException;
import co.edu.uco.ucobet.generales.domain.city.rules.CityIdIsNotNullRule;
import org.springframework.stereotype.Service;

@Service
public final class CityIdIsNotNullRuleImpl implements CityIdIsNotNullRule{

	@Override
	public void validate(final UUID data) {
		if(ObjectHelper.isNull(data)) {
			throw CityIdIsNullException.create();
		}
		
	}

}
