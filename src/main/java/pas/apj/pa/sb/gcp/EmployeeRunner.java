package pas.apj.pa.sb.gcp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner implements  ApplicationRunner {

    private EmployeeRepository employeeRepository;

    public EmployeeRunner(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        employeeRepository.findAll().forEach(System.out::println);
    }
}
