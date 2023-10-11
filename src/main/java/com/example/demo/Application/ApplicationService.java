package com.example.demo.Application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
	
	@Autowired
    ApplicationRepository ar;
	
    public String addProduct(Application app)
    {
        ar.save(app);
        return app.getAppName()+" is added successfully";
    }
    
    public List<Application> getApplicationByAppName(String appName)
    {
        return ar.findByAppName(appName);
    }
    
    public List<Application> getAll()
    {
    	return ar.findAll();
    }
    
    public Application update(String id,Application app)
    {
    	app.setId(id);
    	return ar.save(app);
    }
    
    public String deleteApplicationById(String id)
    {
        ar.deleteById(id);
        return id+" deleted successfully";
    }

}
