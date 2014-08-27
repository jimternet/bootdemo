package com.noofinc.bootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyTableConfiguration {

	
	@Bean
	public String initTable(){
		System.out.println("We're created!");
		return "OK";
	}
//		try {
//		    // Get an instance of CassandraMutagen somehow (ideally inject it)
//		    CassandraMutagen mutagen = new CassandraMutagenImpl();
//
//		    // Initialize the list of mutations
//		    mutagen.initialize("my/cassandra/mutations");
//
//		    // Specify specific subject to mutate, and pass C* session
//		    CassandraSubject subject = new CassandraSubject("TABLE", session)
//
//		    // Mutate! Note, this method may not throw an exception.
//		    Plan.Result<Integer> result = mutagen.mutate(subject);
//
//		    // Inspect result, especially for an exception
//		    if (result.getException() != null) {
//		        // Throw an exception
//		    }
//
//		    // Did something else go wrong?
//		    if (!result.isMutationComplete()) {
//		        // Figure out what happened
//		    }
//		}
//		catch (IOException e) {
//		    // Problem loading the mutations
//		}
//		catch (MutagenException e) {
//		    // Mutation failed
//		}
//	}
	
}
