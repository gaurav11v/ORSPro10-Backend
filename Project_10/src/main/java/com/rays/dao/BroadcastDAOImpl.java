package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BroadcastDTO;

@Repository
public class BroadcastDAOImpl extends BaseDAOImpl<BroadcastDTO> implements BroadcastDAOInt {

	@Override
	protected List<Predicate> getWhereClause(BroadcastDTO dto, CriteriaBuilder builder, Root<BroadcastDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getBroadcastCode())) {

			whereCondition.add(builder.like(qRoot.get("broadcastCode"), dto.getBroadcastCode() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<BroadcastDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return BroadcastDTO.class;
	}

}
