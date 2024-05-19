package com.learn.graphqlscalars.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import graphql.Scalars;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;

@Configuration
public class GraphQlConfig
{
	GraphQLScalarType keyAliasScalar = ExtendedScalars
			.newAliasedScalar("Key")
			.description("Key for ID Scalar")
			.aliasedScalar(Scalars.GraphQLID)
			.build();

	@Bean
	RuntimeWiringConfigurer runtimeWiringConfigurer()
	{
		return wiringBuilder -> wiringBuilder
				.scalar(ExtendedScalars.GraphQLBigDecimal)
				.scalar(keyAliasScalar);
	}
}
