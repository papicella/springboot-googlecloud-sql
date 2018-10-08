package pas.apj.pa.sb.gcp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRest {

    private EmployeeRepository employeeRepository;

    public EmployeeRest(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping("/emps-rest")
    public List<Employee> getAllemps()
    {
        return employeeRepository.findAll();
    }
}
