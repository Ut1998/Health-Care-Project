package com.cg.healthcare.dao;

import com.cg.healthcare.entities.DiagnosticTest;

public interface TestRepository{
	DiagnosticTest findBytestName(String testName);
}
