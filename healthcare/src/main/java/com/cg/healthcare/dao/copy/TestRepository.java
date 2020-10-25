package com.cg.healthcare.dao.copy;

import com.cg.healthcare.entities.DiagnosticTest;

public interface TestRepository{
	DiagnosticTest findBytestName(String testName);
}
