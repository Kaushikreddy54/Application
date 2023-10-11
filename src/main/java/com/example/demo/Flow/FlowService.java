package com.example.demo.Flow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowService {
	
	@Autowired
    FlowRepository fr;
    
    public String addFlow(Flow flow)
    {
        fr.save(flow);
        return flow.getAppName()+" is added successfully";
    }
    public List<Flow> getFlowByAppName(String appName)
    {
      return fr.findFlowByAppName(appName);
    }
    
    public List<Flow> getAll()
    {
    	return fr.findAll();
    }
    
    public Flow update(String id,Flow flow)
    {
    	flow.setId(id);
    	return fr.save(flow);
    }
    
    public String deleteFlowById(String id)
    {
        fr.deleteById(id);
        return id+" deleted successfully";
    }

}
