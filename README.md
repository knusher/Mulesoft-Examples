# mulesoft_examples

The simple_log4j_example project and simple_domain shows how to use a domian to override the log4j logging level based on a 
start up parameter.

## simple_domain
This domain has a contains the following:
* src/main/domain/Mule-domain-config.xml updated with a spring bean for the property reader.  The location uses the ${MULE_ENV} to tell which property file to load at run time
 
 * src/main/resources/test_dev.properties and src/main/resources/test_prod.properties which just has two example properties for logging levels
 
 ## simple_log4j_example
 This project contains a simple flow that listens on port 8081 <a href="http://localhost:8081/test">http://localhost:8081/test</a> and returns the current log level and logs both log levels in the property file for dev.  The following edits have been made for this:
 * src/main/resources/log4j2.xml - line 29 changed to \<AsyncRoot level="${simple_log4j_example_log_level}"/>
 
 ## Putting it all together
In the run configuration or the command line you will need to specifiy -DMULE_ENV=dev or -DMULE_ENV=prod in the VM arguments which will tell the simple_domain which file to load the properties from.  The simple_log4j_examples project then will use the properties to set the current log4j setting and update the flow with the correct values.  I hope this helps keep sensitive information out of proudction logs and allows for an easy way to manage the log4j configuration from dev to prod.
 
 
