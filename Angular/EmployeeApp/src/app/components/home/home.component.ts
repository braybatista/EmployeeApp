import { Component, OnInit} from '@angular/core';
import { Employee } from 'src/app/Models/Employee';
import { EmployeeService } from 'src/app/Services/employee.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  public employees: Array<Employee> = [];

  public employee: Employee = new Employee();

  public filterSearch = '';

  public employeeSearch: Employee = new Employee();

  public filterargs = {
    id: 0,
    employee_name: '',
    employee_salary: 0,
    employee_age: 0,
    profile_image: '',
    employee_anual_salary: 0,
  }

  constructor(private cliservice: EmployeeService) {
  }

  ngOnInit() {
    this.cliservice.findAll().subscribe(response =>{
      console.log(response);
      this.employees = response.data;
    }, error=>{
      console.log(error)
    })
  }

  seleccionarCampo(codigo_employee: number){
    alert("employee seleccionado")
    this.cliservice.findEmployee(codigo_employee).subscribe(response =>{
      console.log(response);
      this.employeeSearch = response.data;
    }, error=>{
      console.log(error)
    })
  }
}
