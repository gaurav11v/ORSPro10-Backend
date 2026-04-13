package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ThemeDAOInt;
import com.rays.dto.ThemeDTO;

@Service
@Transactional
public class ThemeServiceImpl extends BaseServiceImpl<ThemeDTO, ThemeDAOInt> implements ThemeServiceInt  {

}
