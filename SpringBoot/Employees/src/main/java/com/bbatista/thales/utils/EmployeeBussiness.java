package com.bbatista.thales.utils;

public interface EmployeeBussiness {
	
	public default Long calculateAnualSallary(Long salary) {
		return salary != null ? salary * 12 : 0;
	}

}
