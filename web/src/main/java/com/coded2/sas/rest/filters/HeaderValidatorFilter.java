package com.coded2.sas.rest.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class HeaderValidatorFilter implements ContainerRequestFilter{

	@Override
	public void filter(ContainerRequestContext request) throws IOException {
		
	}
}