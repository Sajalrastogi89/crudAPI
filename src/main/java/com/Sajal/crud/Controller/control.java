package com.Sajal.crud.Controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.Sajal.crud.Dao.CrudOperation;
import com.Sajal.crud.model.parameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class control
{

    @Autowired
    CrudOperation operate;
    parameters para;

    @PostMapping(path = "/insert")

    public String Insert(parameters param){
        operate.save(param);
        return "Inserted";
    }
@GetMapping(path = "/read")
    public List<parameters> realAll(){

return operate.findAll();

    }
 @GetMapping(path = "read/{roll}")
public Optional<parameters> readById(@PathVariable("roll") int roll){


     return operate.findById(roll);


}
@DeleteMapping("/delete/{roll}")
    public String delete(@PathVariable("roll") int roll){
        operate.deleteById(roll);
        return "Deleted";
}

    @PutMapping(path = "/update")
    public String Update(parameters param){
        operate.save(param);
        return "Updated";
    }

}
