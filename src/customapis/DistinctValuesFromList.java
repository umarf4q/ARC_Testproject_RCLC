package customapis;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Logger;

import com.provar.core.model.base.api.ValueScope;
import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.*;

@TestApi( title="Distinct Values From List"
        , summary=""
        , remarks=""
        , iconBase=""
        , defaultApiGroups={"Custom"}
        )
@TestApiParameterGroups(parameterGroups={
	    @TestApiParameterGroup(groupName="inputs", title="Inputs"),
	    @TestApiParameterGroup(groupName="result", title="Result"),
	    })
public class DistinctValuesFromList {
    
    @TestApiParameter(seq=1, 
            summary="The first parameter's summary.",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public ArrayList<String> valueList;

    @TestApiParameter(seq=10, 
            summary="The name that the result will be stored under.",
            remarks="",
            mandatory=true,
            parameterGroup="result")
    public String resultName;

    @TestApiParameter(seq=11, 
            summary="The lifespan of the result.",
            remarks="",
            mandatory=true,
            parameterGroup="result",
            defaultValue="Test")
    public ValueScope resultScope;

    /** 
     * Used to write to the test execution log.
     */
    @TestLogger
    public Logger testLogger;
    
    /** 
     * Provides access to facilities, mainly to set and get variable values.
     */
    @TestExecutionContext
    public ITestExecutionContext testExecutionContext;
    
    @TestApiExecutor
    public void execute() {
    	testLogger.info("Original ArrayList is : "+ valueList);
    	ArrayList<String> ArrList = new ArrayList<String>();
    	ArrList = valueList;
        // display original ArrayList
    	testLogger.info("Original ArrayList is : "+ ArrList);
  
        // convert ArrayList to HastSet.
        HashSet<String> hset = new HashSet<String>(ArrList);
        
  
        // display HastSet
        testLogger.info("ArrayList Unique Values is : "+ hset);
        
    	testLogger.info("Hello from " + this.getClass().getName());

        // Store the result (if appropriate).
    	String dummyResult = String.join(";", hset);
        testExecutionContext.setValue(resultName, dummyResult, resultScope);
        
    }
    
}
