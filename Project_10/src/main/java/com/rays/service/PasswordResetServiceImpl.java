package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PasswordResetDAOInt;
import com.rays.dto.PasswordResetDTO;

@Service
@Transactional
public class PasswordResetServiceImpl extends BaseServiceImpl<PasswordResetDTO, PasswordResetDAOInt> implements PasswordResetServiceInt {

}
