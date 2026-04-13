package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ThemeDTO;

@Repository
public class ThemeDAOImpl extends BaseDAOImpl<ThemeDTO> implements ThemeDAOInt{

	@Override
	protected List<Predicate> getWhereClause(ThemeDTO dto, CriteriaBuilder builder, Root<ThemeDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getColor())) {

			whereCondition.add(builder.like(qRoot.get("color"), dto.getColor() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<ThemeDTO> getDTOClass() {
		
		return ThemeDTO.class;
	}

}
