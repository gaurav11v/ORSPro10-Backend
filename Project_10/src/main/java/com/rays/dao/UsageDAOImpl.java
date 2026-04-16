package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.UsageDTO;

@Repository
public class UsageDAOImpl extends BaseDAOImpl<UsageDTO> implements UsageDAOInt {

	@Override
	protected List<Predicate> getWhereClause(UsageDTO dto, CriteriaBuilder builder, Root<UsageDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getUsageCode())) {

			whereCondition.add(builder.like(qRoot.get("usageCode"), dto.getUsageCode() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<UsageDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return UsageDTO.class;
	}

}
